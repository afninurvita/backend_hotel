package com.lawencon.bookinghotelapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_m_hotels")
public class Hotel extends BaseModel{
	
	@ManyToOne
	@JoinColumn(name = "id_city")
	private Cities idCity;
	
	@NotNull
	@Column(nullable = false, unique = true)
	private String code;
	
	private String name;
	
	public Cities getIdCity() {
		return idCity;
	}
	
	public void setIdCity(Cities idCity) {
		this.idCity = idCity;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
