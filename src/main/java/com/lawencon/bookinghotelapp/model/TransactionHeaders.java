package com.lawencon.bookinghotelapp.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_r_transaction_headers")
public class TransactionHeaders {
	
	@Id
	private String id = UUID.randomUUID().toString();
	
	@NotNull
	@Column(nullable = false, unique = true)
	private String code;
	
	private Long totalAmount;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public Long getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	
}
