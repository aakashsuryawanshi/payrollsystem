package com.xzy.payroll.common.entities.wage;

import com.xzy.payroll.common.entities.BaseEntity;

public class EntLoan extends BaseEntity{

	int totalAmount;
	int emiNo;
	float emiAmount;
	String from;
	String userId;
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getEmiNo() {
		return emiNo;
	}
	public void setEmiNo(int emiNo) {
		this.emiNo = emiNo;
	}
	public float getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(float emiAmount) {
		this.emiAmount = emiAmount;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
