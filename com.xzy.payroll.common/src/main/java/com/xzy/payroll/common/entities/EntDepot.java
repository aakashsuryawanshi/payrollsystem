package com.xzy.payroll.common.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EntDepot extends BaseEntity{
	String name;
	String region;
	String state;
	String district;
	String taluka;
	String busStand;
	String code;
	
	public EntDepot(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		this.setUpdatedDate(formatter.format(date));
		this.setCreatedDate(formatter.format(date));
	}
	
	public String getName() {
		return name;
	}
	public void setName(String depotName) {
		this.name = depotName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getBusStand() {
		return busStand;
	}
	public void setBusStand(String busStand) {
		this.busStand = busStand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
