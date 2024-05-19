package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.AppTechnoDto;
import com.internship.exceltodb.model.AppTechno;
import com.internship.exceltodb.repository.AppTechnoRepository;
import org.springframework.stereotype.Service;

@Service
public class AppTechnoService extends GenericService<AppTechnoDto, AppTechno, String> {

    public AppTechnoService(AppTechnoRepository repository) {
        super(repository, AppTechnoDto.class, AppTechno.class);
    }
}
