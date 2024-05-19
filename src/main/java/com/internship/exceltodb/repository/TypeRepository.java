package com.internship.exceltodb.repository;

import com.internship.exceltodb.model.TypeAll;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends GenericRepository<TypeAll, String> {
}
