package com.example.conflict_tracker2.repo;

import com.example.conflict_tracker2.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
