package com.lawencon.bookinghotelapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_r_dtl_transaksi")
public class TransaksiDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_header")
	private TransaksiHeader idHeader;
	
	@ManyToOne
	@JoinColumn(name = "id_kamar")
	private Kamar idKamar;
	
	private Date tanggalCheckIn;
	private Date tanggalCheckOut;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public TransaksiHeader getIdHeader() {
		return idHeader;
	}
	
	public void setIdHeader(TransaksiHeader idHeader) {
		this.idHeader = idHeader;
	}
	
	public Kamar getIdKamar() {
		return idKamar;
	}
	
	public void setIdKamar(Kamar idKamar) {
		this.idKamar = idKamar;
	}
	
	public Date getTanggalCheckIn() {
		return tanggalCheckIn;
	}
	
	public void setTanggalCheckIn(Date tanggalCheckIn) {
		this.tanggalCheckIn = tanggalCheckIn;
	}
	
	public Date getTanggalCheckOut() {
		return tanggalCheckOut;
	}
	
	public void setTanggalCheckOut(Date tanggalCheckOut) {
		this.tanggalCheckOut = tanggalCheckOut;
	}
	
	
}
