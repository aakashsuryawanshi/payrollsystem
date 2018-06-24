package com.xzy.payroll.common.entities.users;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EntDriver extends EntUser{
	String batchNo;
	String depoId;
	
	public EntDriver(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		this.setUpdatedDate(formatter.format(date));
		this.setCreatedDate(formatter.format(date));
	}
}
