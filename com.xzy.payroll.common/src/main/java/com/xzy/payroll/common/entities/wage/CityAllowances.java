package com.xzy.payroll.common.entities.wage;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.xzy.payroll.common.entities.BaseEntity;

public class CityAllowances extends BaseEntity{
	String city;
	String allowances;
	String allowanceId;
	
	
	public CityAllowances(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		this.setUpdatedDate(formatter.format(date));
		this.setCreatedDate(formatter.format(date));
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAllowances() {
		return allowances;
	}
	public void setAllowances(String allowances) {
		this.allowances = allowances;
	}
	public String getAllowanceId() {
		return allowanceId;
	}
	public void setAllowanceId(String allowanceId) {
		this.allowanceId = allowanceId;
	}
	
}
