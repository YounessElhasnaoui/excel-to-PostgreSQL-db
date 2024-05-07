package com.internship.exceltodb.model;

import jakarta.persistence.*;
import java.time.LocalTime;

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
    private LocalTime eventTime;

    @Column(name = "event_users_count")
    private int eventUsersCount;

    // Getters and Setters
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventCity() {
        return eventCity;
    }

    public void setEventCity(String eventCity) {
        this.eventCity = eventCity;
    }

    public int getEventYear() {
        return eventYear;
    }

    public void setEventYear(int eventYear) {
        this.eventYear = eventYear;
    }

    public int getEventMonth() {
        return eventMonth;
    }

    public void setEventMonth(int eventMonth) {
        this.eventMonth = eventMonth;
    }

    public int getEventDay() {
        return eventDay;
    }

    public void setEventDay(int eventDay) {
        this.eventDay = eventDay;
    }

    public LocalTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }

    public int getEventUsersCount() {
        return eventUsersCount;
    }

    public void setEventUsersCount(int eventUsersCount) {
        this.eventUsersCount = eventUsersCount;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventCity='" + eventCity + '\'' +
                ", eventYear=" + eventYear +
                ", eventMonth=" + eventMonth +
                ", eventDay=" + eventDay +
                ", eventTime=" + eventTime +
                ", eventUsersCount=" + eventUsersCount +
                '}';
    }
}
