package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.EventDto;
import com.internship.exceltodb.model.Event;
import com.internship.exceltodb.repository.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private static final Logger logger = LoggerFactory.getLogger(EventService.class);

    @Autowired
    private EventRepository eventRepository;

    public void saveEvent(EventDto eventDto) {
        Event event = new Event();
        event.setEventId(eventDto.getEventId());
        event.setEventName(eventDto.getEventName());
        event.setEventCity(eventDto.getEventCity());
        event.setEventYear(eventDto.getEventYear());
        event.setEventMonth(eventDto.getEventMonth());
        event.setEventDay(eventDto.getEventDay());
        event.setEventTime(eventDto.getEventTime());
        event.setEventUsersCount(eventDto.getEventUsersCount());
        eventRepository.flush();
        eventRepository.save(event);
        logger.info("Saved Event: {}", event);
    }
}
