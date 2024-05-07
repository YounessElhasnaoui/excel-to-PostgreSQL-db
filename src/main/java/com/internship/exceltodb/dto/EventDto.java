package com.internship.exceltodb.dto;

import java.time.LocalTime;

public class EventDto {
    private int eventId;
    private String eventName;
    private String eventCity;
    private int eventYear;
    private int eventMonth;
    private int eventDay;
    private LocalTime eventTime;
    private int eventUsersCount;

    public int getEventId() { return eventId; }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getEventYear() {
        return eventYear;
    }

    public void setEventYear(int eventYear) {
        this.eventYear = eventYear;
    }

    public String getEventCity() {
        return eventCity;
    }

    public void setEventCity(String eventCity) {
        this.eventCity = eventCity;
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
        return "EventDto{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventCity='" + eventCity + '\'' +
                ", eventYear=" + eventYear +
                ", eventMonth=" + eventMonth +
                ", eventDay=" + eventDay +
                ", eventTime='" + eventTime + '\'' +
                ", eventUsersCount=" + eventUsersCount +
                '}';
    }
}
