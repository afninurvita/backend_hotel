package com.lawencon.bookinghotelapp.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_rooms")
public class Rooms {
	
	@Id
	private String id = UUID.randomUUID().toString();
	
	@ManyToOne
	@JoinColumn(name = "id_hotel")
	private Hotel idHotel;
	
	private String roomType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Hotel getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Hotel idHotel) {
		this.idHotel = idHotel;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
}
