package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.entites.Locations;
import com.location.services.LocationServices;


/**
 * Controller class for handling web requests related to Location entities.
 * This class maps HTTP requests to appropriate handler methods and interacts
 * with the LocationServices layer for business logic.
 */
@Controller
public class LocationController {


	@Autowired
	LocationServices locationServices;
	
	//handler methord 
	@RequestMapping("/showlocation")
	public String ShowLocationPage() {
		return "create_location";
	}
	

	/**
     * Handler method to save a new location into the database.
     * 
     * @param location The Location entity populated from the form input.
     * @param model    The ModelMap object for passing data to the view.
     * @return The name of the JSP page for location creation.
     */
	
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
	
	/**
     * Handler method to list all locations.
     * 
     * @param model The ModelMap object for passing the list of locations to the view.
     * @return The name of the JSP page for displaying all locations.
     */
	@RequestMapping("/listAll")
	public String listAll(ModelMap model) {
		List<Locations> location = locationServices.getAllLocation();
		model.addAttribute("location", location);
		return "searchLocation";
	}
	
	
	 /**
     * Handler method to delete a location by its ID.
     * 
     * @param id    The ID of the location to delete.
     * @param model The ModelMap object for passing the updated list of locations to the view.
     * @return The name of the JSP page for displaying all locations.
     */
	@RequestMapping("/delete")
	public String deleteRecordById(@RequestParam("id") long id,ModelMap model) {
		locationServices.deleteById(id);
		List<Locations> location = locationServices.getAllLocation();
		model.addAttribute("location", location);
		return "searchLocation";
	}
	
	
	/**
     * Handler method to fetch a location by its ID for updating.
     * 
     * @param id    The ID of the location to update.
     * @param model The ModelMap object for passing the location details to the view.
     * @return The name of the JSP page for updating a location.
     */
	@RequestMapping("/update")
	public String updateById(@RequestParam("id") long id,ModelMap model) {
		Locations updateById = locationServices.updateById(id);
		model.addAttribute("location", updateById);
		return "update_location";
	}
	
	
	
	 /**
     * Handler method to save updated location details.
     * 
     * @param location The updated Location entity from the form input.
     * @param model    The ModelMap object for passing success message to the view.
     * @return The name of the JSP page for updating a location.
     */
	//DTO:-Data Transfer Object 
	@RequestMapping("/updateLocation")
	public String updateLocation(@ModelAttribute("Loc") Locations location, ModelMap model) {
		locationServices.saveLocation(location);
		model.addAttribute("msg","Data updated in database !!");
		return "update_location";
	}
	
}
