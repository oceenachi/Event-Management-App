package com.francisca.demo.controller.model;


import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;

@Document("Event")
public class MyEvents {

    private String id;
    private String eventTitle;
    private Time eventDate;
    private String gender;
    private enum bookingStatus {
        available, booked , expired
    }
    private enum seatType {
        general, highSingle
    }
    private Time bookedOn;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public Time getBookedOn() {
        return bookedOn;
    }

    public void setBookedOn(Time bookedOn) {
        this.bookedOn = bookedOn;
    }

    public Time getEventDate() {
        return eventDate;
    }

    public void setEventDate(Time eventDate) {
        this.eventDate = eventDate;
    }

    public String getGender() {
        return gender;
    }
}
