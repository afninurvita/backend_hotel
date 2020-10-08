package com.lawencon.bookinghotelapp.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseDao<T> implements GenericDao<T>{
	
	@PersistenceContext
	protected EntityManager em;
	
	private Class<T> type;
	
	public BaseDao() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];
	}
	
	@Override
	public List<T> getAllData() throws Exception {
		return em.createQuery("FROM " + type.getName()).getResultList();
	}
	
	@Override
	public T insert(T data) throws Exception {
		em.persist(data);
		return data;
	}
	
	@Override
	public T update(T data) throws Exception {
		em.merge(data);
		return data;
	}
	
	@Override
	public void deleteById(String id) throws Exception {
		em.remove(id);
	}
}
