package com.lawencon.bookinghotelapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lawencon.bookinghotelapp.model.Roles;

@Repository
public class RolesDaoHibernateImpl extends BaseDao implements RolesDao {

	@Override
	public Roles insert(Roles data) throws Exception {
		// TODO Auto-generated method stub
		em.persist(data);
		return data;
	}

	@Override
	public List<Roles> getListRoles() throws Exception {
		// TODO Auto-generated method stub
		return em.createQuery("FROM Roles", Roles.class).getResultList();
	}

	@Override
	public void delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		em.remove(id);
	}

	@Override
	public Roles update(Roles data) throws Exception {
		// TODO Auto-generated method stub
		return em.merge(data);
	}

}
