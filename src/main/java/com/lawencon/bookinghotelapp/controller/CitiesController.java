package com.lawencon.bookinghotelapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lawencon.bookinghotelapp.model.Cities;
import com.lawencon.bookinghotelapp.service.CitiesService;

@RestController
@RequestMapping("/cities")
public class CitiesController {
	
	@Autowired
	private CitiesService citiesService;

	@PostMapping("/")
	public ResponseEntity<?> insertCity(@RequestBody String cityStr) {
		Cities city = new Cities();
		
		try {
			city = new ObjectMapper().readValue(cityStr, Cities.class);
			city = citiesService.insert(city);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(city, HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getListCities() {
		List<Cities> cities = new ArrayList<>();
		
		try {
			cities = citiesService.getListCities();
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(cities, HttpStatus.OK);
	}
}
