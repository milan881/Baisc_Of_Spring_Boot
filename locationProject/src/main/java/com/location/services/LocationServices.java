package com.location.services;

import java.util.List;

import com.location.entites.Locations;

public interface LocationServices {

	void saveLocation(Locations location);

	List<Locations> getAllLocation();

}
