package com.example.conflict_tracker2.DTO;

import com.example.conflict_tracker2.model.Conflict;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.Set;

public class ConflictPedidaDTO {

    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    private Conflict.status conflictStatus;
    private String description;
    private Set<Long> countryIds;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public Conflict.status getConflictStatus() { return conflictStatus; }
    public void setConflictStatus(Conflict.status conflictStatus) { this.conflictStatus = conflictStatus; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Set<Long> getCountryIds() { return countryIds; }
    public void setCountryIds(Set<Long> countryIds) { this.countryIds = countryIds; }
}
