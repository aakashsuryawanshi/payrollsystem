package com.xzy.payroll.common.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EntRateCard extends BaseEntity {
	float lessThan150;
	float between150And200;
	float between200And225;
	float greaterThan225;

	public EntRateCard(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		this.setUpdatedDate(formatter.format(date));
		this.setCreatedDate(formatter.format(date));
	}

	public float getLessThan150() {
		return lessThan150;
	}

	public void setLessThan150(float lessThan150) {
		this.lessThan150 = lessThan150;
	}

	public float getBetween150And200() {
		return between150And200;
	}

	public void setBetween150And200(float between150And200) {
		this.between150And200 = between150And200;
	}

	public float getBetween200And225() {
		return between200And225;
	}

	public void setBetween200And225(float between200And225) {
		this.between200And225 = between200And225;
	}

	public float getGreaterThan225() {
		return greaterThan225;
	}

	public void setGreaterThan225(float greaterThan225) {
		this.greaterThan225 = greaterThan225;
	}

}
