package com.lawencon.bookinghotelapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_pelanggan")
public class Pelanggan {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_user")
	private Users idUser;
	
	private String kodePelanggan;
	private String nomorktp;
	private String nama;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Users getIdUser() {
		return idUser;
	}
	
	public void setIdUser(Users idUser) {
		this.idUser = idUser;
	}
	
	public String getKodePelanggan() {
		return kodePelanggan;
	}
	
	public void setKodePelanggan(String kodePelanggan) {
		this.kodePelanggan = kodePelanggan;
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
}
