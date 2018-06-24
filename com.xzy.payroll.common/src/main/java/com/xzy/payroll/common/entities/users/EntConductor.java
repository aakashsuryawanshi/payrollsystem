package com.xzy.payroll.common.entities.users;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EntConductor  extends EntUser{
	String trayNo;
	String depoId;
	
	public EntConductor(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		this.setUpdatedDate(formatter.format(date));
		this.setCreatedDate(formatter.format(date));
	}

	public String getTrayNo() {
		return trayNo;
	}

	public void setTrayNo(String trayNo) {
		this.trayNo = trayNo;
	}

	public String getDepoId() {
		return depoId;
	}

	public void setDepoId(String depoId) {
		this.depoId = depoId;
	}
	
}
