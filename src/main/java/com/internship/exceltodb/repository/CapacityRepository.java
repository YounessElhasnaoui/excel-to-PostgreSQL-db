package com.internship.exceltodb.repository;

import com.internship.exceltodb.model.Capacity;
import org.springframework.stereotype.Repository;

@Repository
public interface CapacityRepository extends GenericRepository<Capacity, String> {
}
