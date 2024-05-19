package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.TechnoTypeDto;
import com.internship.exceltodb.model.TechnoType;
import com.internship.exceltodb.repository.TechnoTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class TechnoTypeService extends GenericService<TechnoTypeDto, TechnoType, String> {

    public TechnoTypeService(TechnoTypeRepository repository) {
        super(repository, TechnoTypeDto.class, TechnoType.class);
    }
}
