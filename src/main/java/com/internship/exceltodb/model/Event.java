package com.internship.exceltodb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(name = "event_id")
    private int eventId;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "event_city")
    private String eventCity;

    @Column(name = "event_year")
    private int eventYear;

    @Column(name = "event_month")
    private int eventMonth;

    @Column(name = "event_day")
    private int eventDay;

    @Column(name = "event_time")
    private String eventTime;

    @Column(name = "event_users_count")
    private int eventUsersCount;

    // Getters
    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventCity() {
        return eventCity;
    }

    public int getEventYear() {
        return eventYear;
    }

    public int getEventMonth() {
        return eventMonth;
    }

    public int getEventDay() {
        return eventDay;
    }

    public String getEventTime() {
        return eventTime;
    }

    public int getEventUsersCount() {
        return eventUsersCount;
    }

    // Setters
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventCity(String eventCity) {
        this.eventCity = eventCity;
    }

    public void setEventYear(int eventYear) {
        this.eventYear = eventYear;
    }

    public void setEventMonth(int eventMonth) {
        this.eventMonth = eventMonth;
    }

    public void setEventDay(int eventDay) {
        this.eventDay = eventDay;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public void setEventUsersCount(int eventUsersCount) {
        this.eventUsersCount = eventUsersCount;
    }
}
