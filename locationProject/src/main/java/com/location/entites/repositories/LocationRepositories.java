package com.location.entites.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.entites.Locations;

public interface LocationRepositories extends JpaRepository<Locations, Long> {

}
