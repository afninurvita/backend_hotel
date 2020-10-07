package com.lawencon.bookinghotelapp.dao;

import java.util.List;

import com.lawencon.bookinghotelapp.model.Roles;

public interface RolesDao {
	
	Roles insert(Roles data) throws Exception;
	
	List<Roles> getListJabatan() throws Exception;
	
	void delete(Long id) throws Exception;
	
	Roles update(Roles data) throws Exception;
	
}
