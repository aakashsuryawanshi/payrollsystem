package com.xzy.payroll.common.entities.wage;

import java.util.List;

import com.xzy.payroll.common.entities.BaseEntity;

public class EntDeductions extends BaseEntity{
	String userId;
	List<EntLoan> loans;

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<EntLoan> getLoans() {
		return loans;
	}

	public void setLoans(List<EntLoan> loans) {
		this.loans = loans;
	}
	
	
}
