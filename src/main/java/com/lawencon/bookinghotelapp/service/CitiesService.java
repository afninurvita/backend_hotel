package com.lawencon.bookinghotelapp.service;

import java.util.List;

import com.lawencon.bookinghotelapp.model.Cities;

public interface CitiesService {
	
	List<Cities> getListCities() throws Exception;
	
	Cities insert(Cities data) throws Exception;
	
	Cities update(Cities data) throws Exception;
	
	void deleteById(String id) throws Exception;

}
