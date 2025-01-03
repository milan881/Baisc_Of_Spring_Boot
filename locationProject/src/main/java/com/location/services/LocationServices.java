package com.location.services;

import java.util.List;

import com.location.entites.Locations;

/**
 * Service interface for handling business logic related to Locations.
 * Defines methods for managing Location entities.
 */
public interface LocationServices {
	
    /**
     * Saves a new Location entity or updates an existing one in the database.
     * 
     * @param location The Location entity to be saved or updated.
     */
	void saveLocation(Locations location);

	/**
     * Retrieves a list of all Location entities from the database.
     * 
     * @return A List of Location entities.
     */
	List<Locations> getAllLocation();

	/**
     * Deletes a Location entity from the database based on its ID.
     * 
     * @param id The ID of the Location entity to be deleted.
     */
	void deleteById(long id);

	 /**
     * Retrieves a Location entity by its ID for updating.
     * 
     * @param id The ID of the Location entity to retrieve.
     * @return The Location entity with the specified ID.
     */
	Locations updateById(long id);

}
