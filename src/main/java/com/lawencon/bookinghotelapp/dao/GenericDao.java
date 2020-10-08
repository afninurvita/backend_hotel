package com.lawencon.bookinghotelapp.dao;

import java.util.List;

public interface GenericDao<T> {
	
	List<T> getAllData() throws Exception;
	
	T insert(T data) throws Exception;
	
	T update(T data) throws Exception;
	
	void deleteById(String id) throws Exception;

}
