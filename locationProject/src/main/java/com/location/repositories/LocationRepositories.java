package com.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.location.entites.Locations;

@Repository
public interface LocationRepositories extends JpaRepository<Locations, Long> {
    // Add custom methods here if needed
}