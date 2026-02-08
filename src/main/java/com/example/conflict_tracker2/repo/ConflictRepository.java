package com.example.conflict_tracker2.repo;

import com.example.conflict_tracker2.model.Conflict;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConflictRepository extends JpaRepository<Conflict, Long> {
    List<Conflict> findByConflictStatus(Conflict.status conflictStatus);

    List<Conflict> findByCountriesCode(String code);

}
