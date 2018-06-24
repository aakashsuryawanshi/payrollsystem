package com.xzy.payroll.common.entities.wage;

import java.util.List;

import com.xzy.payroll.common.entities.BaseEntity;

public class EntWage extends BaseEntity{
	String userId;
	float basePay;
	float hra;
	float da;
	String date;
	List<EntAllowances> allowances;
	List<EntDeductions> deductions;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public float getBasePay() {
		return basePay;
	}
	public void setBasePay(float basePay) {
		this.basePay = basePay;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}
	public List<EntAllowances> getAllowances() {
		return allowances;
	}
	public void setAllowances(List<EntAllowances> allowances) {
		this.allowances = allowances;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<EntDeductions> getDeductions() {
		return deductions;
	}
	public void setDeductions(List<EntDeductions> deductions) {
		this.deductions = deductions;
	}
	
	
}
