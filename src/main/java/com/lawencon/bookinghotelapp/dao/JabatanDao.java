package com.lawencon.bookinghotelapp.dao;

import java.util.List;

import com.lawencon.bookinghotelapp.model.Jabatan;

public interface JabatanDao {
	
	Jabatan insert(Jabatan data) throws Exception;
	
	List<Jabatan> getListJabatan() throws Exception;
	
	void delete(Long id) throws Exception;
	
	Jabatan update(Jabatan data) throws Exception;
	
}
