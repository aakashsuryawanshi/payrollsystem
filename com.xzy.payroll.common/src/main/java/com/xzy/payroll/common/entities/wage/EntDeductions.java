package com.xzy.payroll.common.entities.wage;

import java.util.List;

import com.xzy.payroll.common.entities.BaseEntity;

public class EntDeductions extends BaseEntity{
	List<EntLoan> loans;

	public List<EntLoan> getLoans() {
		return loans;
	}

	public void setLoans(List<EntLoan> loans) {
		this.loans = loans;
	}
	
	
}
