package com.xzy.payroll.common.entities.wage;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.xzy.payroll.common.entities.BaseEntity;

public class EntAllowances extends BaseEntity{

	String post;
	String pare;
	String night;
	String handicap;
	String travel;
	
	public EntAllowances(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		this.setUpdatedDate(formatter.format(date));
		this.setCreatedDate(formatter.format(date));
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPare() {
		return pare;
	}

	public void setPare(String pare) {
		this.pare = pare;
	}

	public String getNight() {
		return night;
	}

	public void setNight(String night) {
		this.night = night;
	}

	public String getHandicap() {
		return handicap;
	}

	public void setHandicap(String handicap) {
		this.handicap = handicap;
	}

	public String getTravel() {
		return travel;
	}

	public void setTravel(String travel) {
		this.travel = travel;
	}
	
	
}
