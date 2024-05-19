package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.AppOwnerDto;
import com.internship.exceltodb.model.AppOwner;
import com.internship.exceltodb.repository.AppOwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class AppOwnerService extends GenericService<AppOwnerDto, AppOwner, String> {

    public AppOwnerService(AppOwnerRepository repository) {
        super(repository, AppOwnerDto.class, AppOwner.class);
    }
}
