package com.lawencon.bookinghotelapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User idUser;
	
	private String nip;
	private String nomorktp;
	private String nama;
	
	@ManyToOne
	@JoinColumn(name = "id_agent")
	private Agent idAgent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getNomorktp() {
		return nomorktp;
	}

	public void setNomorktp(String nomorktp) {
		this.nomorktp = nomorktp;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Agent getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(Agent idAgent) {
		this.idAgent = idAgent;
	}
}
