package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.PersonnesDto;
import com.internship.exceltodb.model.Personnes;
import com.internship.exceltodb.repository.PersonnesRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonnesService extends GenericService<PersonnesDto, Personnes, String> {

    public PersonnesService(PersonnesRepository repository) {
        super(repository, PersonnesDto.class, Personnes.class);
    }
}
