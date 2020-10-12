package com.lawencon.bookinghotelapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_m_roles")
public class Roles extends BaseModel{
	
	@NotNull
	@Column(nullable = false)
	private String code;
	
	@Column(name = "role_name")
	private String roleName;
	
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
