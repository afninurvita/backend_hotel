package com.lawencon.bookinghotelapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_agent")
public class Agent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_user")
	private Users idUser;
	
	private String nama;
	private String nip;
	
	@ManyToOne
	@JoinColumn(name = "id_hotel")
	private Hotel idHotel;
	
	@ManyToOne
	@JoinColumn(name = "id_pelanggan")
	private Pelanggan idPelanggan;
	
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
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public Hotel getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Hotel idHotel) {
		this.idHotel = idHotel;
	}
	public Pelanggan getIdPelanggan() {
		return idPelanggan;
	}
	public void setIdPelanggan(Pelanggan idPelanggan) {
		this.idPelanggan = idPelanggan;
	}
	
	
}
