package com.location.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entites.Locations;
import com.location.repositories.LocationRepositories;

@Service
public class LocationServicesImpl implements LocationServices {

	@Autowired
	private LocationRepositories locationRepo;
	
	@Override
	public void saveLocation(Locations locatoin) {
		// TODO Auto-generated method stub
		locationRepo.save(locatoin);
	}

}
