package com.lawencon.bookinghotelapp.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_m_roles")
public class Roles {
	
	@Id
	private String id = UUID.randomUUID().toString();
	
	@NotNull
	@Column(nullable = false)
	private String code;
	
	@Column(name = "role_name")
	private String roleName;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
