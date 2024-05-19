package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.ApplicationsDto;
import com.internship.exceltodb.model.Applications;
import com.internship.exceltodb.repository.ApplicationsRepository;
import org.springframework.stereotype.Service;

@Service
public class ApplicationsService extends GenericService<ApplicationsDto, Applications, String> {

    public ApplicationsService(ApplicationsRepository repository) {
        super(repository, ApplicationsDto.class, Applications.class);
    }
}
