package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.ApplicationsDto;
import com.internship.exceltodb.model.Applications;
import com.internship.exceltodb.repository.ApplicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ApplicationsService extends GenericService<ApplicationsDto, Applications, String> {

    @Autowired
    public ApplicationsService(@Qualifier("applicationsRepository") ApplicationsRepository repository) {
        super(repository, ApplicationsDto.class, Applications.class);
    }
}
