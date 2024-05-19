package com.internship.exceltodb.repository;

import com.internship.exceltodb.model.TechnoType;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnoTypeRepository extends GenericRepository<TechnoType, String> {
}
