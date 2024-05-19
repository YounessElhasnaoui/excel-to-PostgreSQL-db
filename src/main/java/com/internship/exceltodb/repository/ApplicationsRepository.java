package com.internship.exceltodb.repository;

import com.internship.exceltodb.model.Applications;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationsRepository extends GenericRepository<Applications, String> {
}
