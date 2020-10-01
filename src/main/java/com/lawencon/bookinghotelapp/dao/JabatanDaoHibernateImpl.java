package com.lawencon.bookinghotelapp.dao;

import java.util.List;

import com.lawencon.bookinghotelapp.model.Jabatan;

public class JabatanDaoHibernateImpl extends BaseDao implements JabatanDao {

	@Override
	public Jabatan insert(Jabatan data) throws Exception {
		// TODO Auto-generated method stub
		em.persist(data);
		return data;
	}

	@Override
	public List<Jabatan> getListJabatan() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jabatan update(Jabatan data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
