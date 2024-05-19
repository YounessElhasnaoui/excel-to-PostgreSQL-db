package com.internship.exceltodb.repository;

import com.internship.exceltodb.model.Personnes;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnesRepository extends GenericRepository<Personnes, String> {
}
