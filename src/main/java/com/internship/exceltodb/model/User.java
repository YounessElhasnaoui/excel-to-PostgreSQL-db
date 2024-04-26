package com.internship.exceltodb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_fname")
    private String firstName;

    @Column(name = "user_lname")
    private String lastName;

    @Column(name = "user_email", unique = true)
    private String email;

    @Column(name = "user_dob_year")
    private int dobYear;

    @Column(name = "user_dob_month")
    private int dobMonth;

    @Column(name = "user_dob_day")
    private int dobDay;

    @Column(name = "user_gender")
    private String gender;

    @Column(name = "user_city")
    private String city;

    @Column(name = "user_event")
    private int eventId;

    @Column(name = "user_role")
    private String role;

    // Getters and Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getDobYear() { return dobYear; }
    public void setDobYear(int dobYear) { this.dobYear = dobYear; }

    public int getDobMonth() { return dobMonth; }
    public void setDobMonth(int dobMonth) { this.dobMonth = dobMonth; }

    public int getDobDay() { return dobDay; }
    public void setDobDay(int dobDay) { this.dobDay = dobDay; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public int getEventId() { return eventId; }
    public void setEventId(int eventId) { this.eventId = eventId; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
