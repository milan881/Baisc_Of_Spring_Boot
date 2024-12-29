package com.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.entites.Locations;

public interface LocationRepositories extends JpaRepository<Locations,Long> {

}
