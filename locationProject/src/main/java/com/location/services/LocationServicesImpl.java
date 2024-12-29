package com.location.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entites.Locations;
import com.location.repositories.LocationRepositories;

@Service
public class LocationServicesImpl implements LocationServices {

	@Autowired
	public LocationRepositories locationRepo;
	
	@Override
	public void saveLocation(Locations location) {
		// TODO Auto-generated method stub
		locationRepo.save(location);
	}

	@Override
	public List<Locations> getAllLocation() {
		// TODO Auto-generated method stub
		List<Locations> locations = locationRepo.findAll();
		return locations;
	}

}
