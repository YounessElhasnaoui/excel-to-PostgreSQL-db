package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.EventDto;
import com.internship.exceltodb.model.Event;
import com.internship.exceltodb.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public Event saveEvent(EventDto eventDto) {
        Event event = new Event();
        // Map DTO to entity
        event.setEventId(eventDto.getEventId());
        event.setEventName(eventDto.getEventName());
        event.setEventCity(eventDto.getEventCity());
        event.setEventYear(eventDto.getEventYear());
        event.setEventMonth(eventDto.getEventMonth());
        event.setEventDay(eventDto.getEventDay());
        event.setEventTime(eventDto.getEventTime());
        event.setEventUsersCount(eventDto.getEventUsersCount());
        return eventRepository.save(event);
    }

    public Event findEventById(int id) {
        return eventRepository.findById(id).orElse(null);
    }
}
