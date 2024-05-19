package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.TypeAllDto;
import com.internship.exceltodb.model.TypeAll;
import com.internship.exceltodb.repository.TypeRepository;
import org.springframework.stereotype.Service;

@Service
public class TypeService extends GenericService<TypeAllDto, TypeAll, String> {

    public TypeService(TypeRepository repository) {
        super(repository, TypeAllDto.class, TypeAll.class);
    }
}
