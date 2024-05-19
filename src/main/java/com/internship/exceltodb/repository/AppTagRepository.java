package com.internship.exceltodb.repository;

import com.internship.exceltodb.model.AppTag;
import org.springframework.stereotype.Repository;

@Repository
public interface AppTagRepository extends GenericRepository<AppTag, String> {
}
