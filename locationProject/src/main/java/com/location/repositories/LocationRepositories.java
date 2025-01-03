package com.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.entites.Locations;

/**
 * Repository interface for the Locations entity.
 * 
 * This interface extends JpaRepository, providing CRUD operations
 * and additional JPA functionalities for the Locations entity.
 * 
 * JpaRepository<Locations, Long>:
 * - Locations: The type of the entity to manage.
 * - Long: The type of the entity's primary key.
 */
public interface LocationRepositories extends JpaRepository<Locations,Long> {

}
