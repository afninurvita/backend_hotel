package com.lawencon.bookinghotelapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_r_hdr_transaksi")
public class TransaksiHeader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long biaya;
	
	@ManyToOne
	@JoinColumn(name = "id_pelanggan")
	private Pelanggan idPelanggan;
	
	@ManyToOne
	@JoinColumn(name = "id_agent")
	private Agent idAgent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBiaya() {
		return biaya;
	}

	public void setBiaya(Long biaya) {
		this.biaya = biaya;
	}

	public Pelanggan getIdPelanggan() {
		return idPelanggan;
	}

	public void setIdPelanggan(Pelanggan idPelanggan) {
		this.idPelanggan = idPelanggan;
	}

	public Agent getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(Agent idAgent) {
		this.idAgent = idAgent;
	}

	
}
