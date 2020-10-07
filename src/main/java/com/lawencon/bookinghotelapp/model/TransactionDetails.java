package com.lawencon.bookinghotelapp.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_r_transaction_details")
public class TransactionDetails {

	@Id
	private String id = UUID.randomUUID().toString();
	
	@ManyToOne
	@JoinColumn(name = "id_header")
	private TransactionHeaders idHeader;
	
	@ManyToOne
	@JoinColumn(name = "id_room")
	private Rooms idRoom;
	
	private Date checkInDate;
	private Date checkOutDate;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public TransactionHeaders getIdHeader() {
		return idHeader;
	}
	
	public void setIdHeader(TransactionHeaders idHeader) {
		this.idHeader = idHeader;
	}
	
	public Rooms getIdRoom() {
		return idRoom;
	}
	
	public void setIdRoom(Rooms idRoom) {
		this.idRoom = idRoom;
	}
	
	public Date getCheckInDate() {
		return checkInDate;
	}
	
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
}
