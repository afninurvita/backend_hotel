package com.lawencon.bookinghotelapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_r_transaction_headers")
public class TransactionHeaders extends BaseModel{
	
	@NotNull
	@Column(nullable = false, unique = true)
	private String code;
	
	private Long totalAmount;
	
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
