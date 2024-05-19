package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.CapacityDto;
import com.internship.exceltodb.model.Capacity;
import com.internship.exceltodb.repository.CapacityRepository;
import org.springframework.stereotype.Service;

@Service
public class CapacityService extends GenericService<CapacityDto, Capacity, String> {

    public CapacityService(CapacityRepository repository) {
        super(repository, CapacityDto.class, Capacity.class);
    }
}
