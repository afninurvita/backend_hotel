package com.lawencon.bookinghotelapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_kota")
public class Kota {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String kodeKota;
	private String namaKota;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getKodeKota() {
		return kodeKota;
	}
	
	public void setKodeKota(String kodeKota) {
		this.kodeKota = kodeKota;
	}
	
	public String getNamaKota() {
		return namaKota;
	}
	
	public void setNamaKota(String namaKota) {
		this.namaKota = namaKota;
	}
	
	
}
