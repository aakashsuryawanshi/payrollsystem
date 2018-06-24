package com.xzy.payroll.common.entities.users;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EntDepoManager  extends EntUser{
	String depoId;
	
	public EntDepoManager(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		this.setUpdatedDate(formatter.format(date));
		this.setCreatedDate(formatter.format(date));
	}

	public String getDepoId() {
		return depoId;
	}

	public void setDepoId(String depoId) {
		this.depoId = depoId;
	}
	
}
