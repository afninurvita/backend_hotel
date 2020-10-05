package com.lawencon.bookinghotelapp.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_m_users")
public class Users {
	
	@Id
	private String id =UUID.randomUUID().toString();
	
	@NotNull
	@Column(name ="user_name", nullable = false)
	private String username;
	
	@NotNull
	@Column(nullable = false)
	private String psword;
	
	@ManyToOne
	@JoinColumn(name = "id_role")
	private Roles idRole;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Roles getIdRole() {
		return idRole;
	}

	public void setJabatanId(Roles idRole) {
		this.idRole = idRole;
	}

	
	
}
