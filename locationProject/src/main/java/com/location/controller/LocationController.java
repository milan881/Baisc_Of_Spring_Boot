package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.location.entites.Locations;
import com.location.services.LocationServices;

@Controller
public class LocationController {


	@Autowired
	LocationServices locationServices;
	
	//handler methord 
	@RequestMapping("/showlocation")
	public String ShowLocationPage() {
		return "create_location";
	}
	

	//DTO:-Data Transfer Object 
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("Loc") Locations location, ModelMap model) {
		/*
		location.setId(1);
		location.setName("Jamshedpur");
		location.setCodes("831004");
		location.setType("urban");
		System.out.println(location.getId());
		System.out.println(location.getName());
		System.out.println(location.getCodes());
		System.out.println(location.getType());
			*/
		locationServices.saveLocation(location);
		model.addAttribute("msg","Data saved in database !!");
		return "create_location";
	}
		
		
	/*
	@RequestMapping("/saveLocation")
	public String saveLocation(@RequestParam("id") long id, @RequestParam("name") String name, @RequestParam("codes") String codes, @RequestParam("type") String type) {
			Locations location = new Locations();
			location.setId(id);
			location.setName(name);
			location.setCodes(codes);
			location.setType(type);
			locationServices.saveLocation(location);
		return "create_location";
	}
	*/
	
	/*
	@RequestMapping("/saveLocation")
	public String saveLocation(LocationData loca) {
		Locations loc = new Locations();
		loc.setId(loca.getId());
		loc.setCodes(loca.getCodes());
		loc.setName(loc.getName());
		loc.setType(loca.getType());
		locationServices.saveLocation(loc);
		return "save_location";
	}
	*/
	
	@RequestMapping("/listAll")
	public String listAll() {
		List<Locations> = locationServices.getAllLocation();
		return "listAll";
	}
	
}
