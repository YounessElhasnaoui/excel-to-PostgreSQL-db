package com.internship.exceltodb.repository;

import com.internship.exceltodb.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
