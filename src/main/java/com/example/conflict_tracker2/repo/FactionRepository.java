package com.example.conflict_tracker2.repo;

import com.example.conflict_tracker2.model.Faction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactionRepository extends JpaRepository<Faction, Long> {
}
