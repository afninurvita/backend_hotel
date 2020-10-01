package com.lawencon.bookinghotelapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_kota")
	private Kota idKota;
	
	private String kodeHotel;
	private String namaHotel;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Kota getIdKota() {
		return idKota;
	}
	
	public void setIdKota(Kota idKota) {
		this.idKota = idKota;
	}
	
	public String getKodeHotel() {
		return kodeHotel;
	}
	
	public void setKodeHotel(String kodeHotel) {
		this.kodeHotel = kodeHotel;
	}
	
	public String getNamaHotel() {
		return namaHotel;
	}
	
	public void setNamaHotel(String namaHotel) {
		this.namaHotel = namaHotel;
	}
	
	

}
