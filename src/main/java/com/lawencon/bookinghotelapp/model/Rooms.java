package com.lawencon.bookinghotelapp.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_rooms")
public class Rooms extends BaseModel{
	
	@ManyToOne
	@JoinColumn(name = "id_hotel")
	private Hotel idHotel;
	
	private String roomType;

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
