package com.lawencon.bookinghotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lawencon.bookinghotelapp.dao.CitiesDao;
import com.lawencon.bookinghotelapp.model.Cities;

@Service
@Transactional
public class CitiesServiceImpl implements CitiesService{
	
	@Autowired
	private CitiesDao citiesDao;

	@Override
	public List<Cities> getListCities() throws Exception {
		return citiesDao.getAllData();
	}

	@Override
	public Cities insert(Cities data) throws Exception {
		return citiesDao.insert(data);
	}

	@Override
	public Cities update(Cities data) throws Exception {
		return citiesDao.update(data);
	}

	@Override
	public void deleteById(String id) throws Exception {
		citiesDao.deleteById(id);
	}

}
