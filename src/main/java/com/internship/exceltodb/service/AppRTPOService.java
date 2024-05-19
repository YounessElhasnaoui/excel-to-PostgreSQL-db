package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.AppRTPODto;
import com.internship.exceltodb.model.AppRTPO;
import com.internship.exceltodb.repository.AppRTPORepository;
import org.springframework.stereotype.Service;

@Service
public class AppRTPOService extends GenericService<AppRTPODto, AppRTPO, String> {

    public AppRTPOService(AppRTPORepository repository) {
        super(repository, AppRTPODto.class, AppRTPO.class);
    }
}
