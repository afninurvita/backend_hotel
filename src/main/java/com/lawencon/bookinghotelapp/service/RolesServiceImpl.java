package com.lawencon.bookinghotelapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.bookinghotelapp.dao.RolesDao;
import com.lawencon.bookinghotelapp.model.Roles;

@Service
@Transactional
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesDao rolesDao;
	
	@Override
	public Roles insert(Roles data) throws Exception {
		// TODO Auto-generated method stub
		return rolesDao.insert(data);
	}

	@Override
	public List<Roles> getListRoles() throws Exception {
		// TODO Auto-generated method stub
		return rolesDao.getListRoles();
	}

	@Override
	public void delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		rolesDao.delete(id);
	}

	@Override
	public Roles update(Roles data) throws Exception {
		// TODO Auto-generated method stub
		return rolesDao.update(data);
	}
	
	
}
