package com.lawencon.bookinghotelapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_jabatan")
public class Jabatan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String kodeJabatan;
	private String namaJabatan;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getKodeJabatan() {
		return kodeJabatan;
	}
	
	public void setKodeJabatan(String kodeJabatan) {
		this.kodeJabatan = kodeJabatan;
	}

	public String getNamaJabatan() {
		return namaJabatan;
	}

	public void setNamaJabatan(String namaJabatan) {
		this.namaJabatan = namaJabatan;
	}
	
	
}
