package com.example.conflict_tracker2.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Conflict {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private LocalDate startDate;

    @Enumerated(EnumType.STRING)
    private status conflictStatus;

    @Lob
    @Column(columnDefinition = "text")
    private String description;


   @ManyToMany
    @JoinTable(
            name = "conflict-country",
            joinColumns = @JoinColumn(name = "conflict_id"),
            inverseJoinColumns = @JoinColumn(name = "country_id")
    )

    private Set<Country> countries;

    public enum status {
        ACTIVE, FROZEN, ENDED
    }

    public Conflict() {
    }

    public Conflict(long id, String name, LocalDate startDate, status conflictStatus, String description, Set<Country> countries) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.conflictStatus = conflictStatus;
        this.description = description;
        this.countries = countries;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public status getConflictStatus() {
        return conflictStatus;
    }

    public String getDescription() {
        return description;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setConflictStatus(status conflictStatus) {
        this.conflictStatus = conflictStatus;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }
}
