package com.internship.exceltodb.repository;

import com.internship.exceltodb.model.AppOwner;
import org.springframework.stereotype.Repository;

@Repository
public interface AppOwnerRepository extends GenericRepository<AppOwner, String> {
}
