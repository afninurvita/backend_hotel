package com.lawencon.bookinghotelapp.dao;

import java.util.List;

import com.lawencon.bookinghotelapp.model.Roles;

public class JabatanDaoHibernateImpl extends BaseDao implements JabatanDao {

	@Override
	public Roles insert(Roles data) throws Exception {
		// TODO Auto-generated method stub
		em.persist(data);
		return data;
	}

	@Override
	public List<Roles> getListJabatan() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Roles update(Roles data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
