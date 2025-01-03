package com.location.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entites.Locations;
import com.location.repositories.LocationRepositories;


/**
 * Implementation of the LocationServices interface.
 * Handles business logic related to Location entities.
 */
@Service
public class LocationServicesImpl implements LocationServices {

	@Autowired
	public LocationRepositories locationRepo;
	
	
	/**
     * Saves a new Location entity or updates an existing one in the database.
     * 
     * @param location The Location entity to save or update.
     */ 	
	@Override
	public void saveLocation(Locations location) {
		// TODO Auto-generated method stub
		locationRepo.save(location);
	}

	
	/**
     * Saves a new Location entity or updates an existing one in the database.
     * 
     * @param location The Location entity to save or update.
     */
	@Override
	public List<Locations> getAllLocation() {
		// TODO Auto-generated method stub
		List<Locations> locations = locationRepo.findAll();
		return locations;
	}

	
    /**
     * Deletes a Location entity from the database by its ID.
     * 
     * @param id The ID of the Location entity to delete.
     */
	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		locationRepo.deleteById(id);
	}
	/**
     * Retrieves a Location entity by its ID for updating.
     * 
     * @param id The ID of the Location entity to retrieve.
     * @return The Location entity if found.
     * @throws NoSuchElementException if the entity is not found.
     */
	@Override
	public Locations updateById(long id) {
		// TODO Auto-generated method stub
		Optional<Locations> findById = locationRepo.findById(id);
		Locations locations = findById.get();
		return locations;
	}

}
