package com.internship.exceltodb.service;

import com.internship.exceltodb.annotation.DtoField;
import com.internship.exceltodb.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GenericService<D, E, ID extends Serializable> {

    private final GenericRepository<E, ID> repository;
    private final Class<D> dtoClass;
    private final Class<E> entityClass;

    @Autowired
    public GenericService(GenericRepository<E, ID> repository, Class<D> dtoClass, Class<E> entityClass) {
        this.repository = repository;
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    @Transactional
    public D save(D dto) {
        try {
            E entity = mapDtoToEntity(dto);
            entity = repository.save(entity);
            return mapEntityToDto(entity);
        } catch (Exception e) {
            throw new RuntimeException("Error saving entity", e);
        }
    }

    public D findById(ID id) {
        try {
            Optional<E> entity = repository.findById(id);
            return entity.map(e -> {
                try {
                    return mapEntityToDto(e);
                } catch (Exception ex) {
                    throw new RuntimeException("Error mapping entity to DTO", ex);
                }
            }).orElse(null);
        } catch (Exception e) {
            throw new RuntimeException("Error finding entity by ID", e);
        }
    }

    public List<D> findAll() {
        try {
            List<E> entities = repository.findAll();
            return entities.stream().map(e -> {
                try {
                    return mapEntityToDto(e);
                } catch (Exception ex) {
                    throw new RuntimeException("Error mapping entity to DTO", ex);
                }
            }).collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Error finding all entities", e);
        }
    }

    @Transactional
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    private E mapDtoToEntity(D dto) throws Exception {
        E entity = entityClass.getDeclaredConstructor().newInstance();
        for (Field dtoField : dtoClass.getDeclaredFields()) {
            if (dtoField.isAnnotationPresent(DtoField.class)) {
                String entityFieldName = dtoField.getAnnotation(DtoField.class).value();
                Field entityField = entityClass.getDeclaredField(entityFieldName);
                dtoField.setAccessible(true);
                entityField.setAccessible(true);
                entityField.set(entity, dtoField.get(dto));
            }
        }
        return entity;
    }

    private D mapEntityToDto(E entity) throws Exception {
        D dto = dtoClass.getDeclaredConstructor().newInstance();
        for (Field entityField : entityClass.getDeclaredFields()) {
            for (Field dtoField : dtoClass.getDeclaredFields()) {
                if (dtoField.isAnnotationPresent(DtoField.class) &&
                        dtoField.getAnnotation(DtoField.class).value().equals(entityField.getName())) {
                    entityField.setAccessible(true);
                    dtoField.setAccessible(true);
                    dtoField.set(dto, entityField.get(entity));
                }
            }
        }
        return dto;
    }
}
