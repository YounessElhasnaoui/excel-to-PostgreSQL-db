package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.AppTagDto;
import com.internship.exceltodb.model.AppTag;
import com.internship.exceltodb.repository.AppTagRepository;
import org.springframework.stereotype.Service;

@Service
public class AppTagService extends GenericService<AppTagDto, AppTag, String> {

    public AppTagService(AppTagRepository repository) {
        super(repository, AppTagDto.class, AppTag.class);
    }
}
