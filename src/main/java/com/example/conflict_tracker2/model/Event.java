package com.example.conflict_tracker2.model;


import jakarta.persistence.*;

import java.time.LocalDate;

//@Entity
public class Event {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate eventDate;
    private String location;
    private String description;

    /*@ManyToOne
    @JoinColumn(name = "conflict_id")*/
    private Conflict conflict;


    public Event() {
    }

    public Event(Long id, LocalDate eventDate, String locaion, String description, Conflict conflict) {
        this.id = id;
        this.eventDate = eventDate;
        this.location = locaion;
        this.description = description;
        this.conflict = conflict;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Conflict getConflict() {
        return conflict;
    }

    public void setConflict(Conflict conflict) {
        this.conflict = conflict;
    }
}
