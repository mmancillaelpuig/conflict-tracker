package com.example.conflict_tracker2.repo;

import com.example.conflict_tracker2.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
