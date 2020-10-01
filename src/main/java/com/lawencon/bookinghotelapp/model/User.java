package com.lawencon.bookinghotelapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String psword;
	
	@ManyToOne
	@JoinColumn(name = "id_jabatan")
	private Jabatan jabatanId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPsword() {
		return psword;
	}

	public void setPsword(String psword) {
		this.psword = psword;
	}

	public Jabatan getJabatanId() {
		return jabatanId;
	}

	public void setJabatanId(Jabatan jabatanId) {
		this.jabatanId = jabatanId;
	}

	
	
}
