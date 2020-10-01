package com.lawencon.bookinghotelapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_kamar")
public class Kamar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_hotel")
	private Hotel idHotel;
	
	private String tipeKamar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Hotel getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Hotel idHotel) {
		this.idHotel = idHotel;
	}

	public String getTipeKamar() {
		return tipeKamar;
	}

	public void setTipeKamar(String tipeKamar) {
		this.tipeKamar = tipeKamar;
	}
	
	
}
