package com.casestudy.project.ewallet.model;

import java.util.List;

public class Ewallet {
	private String ewalletId;
	private double currentBalance;
	public String getEwalletId() {
	return ewalletId;
	}
	public void setEwalletId(String ewalletId) {
	this.ewalletId = ewalletId;
	}
	public double getCurrentBalance() {
	return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
	this.currentBalance = currentBalance;
	}
	public List<Statement> getStatements() {
		return null;
		}

		public List<Statement> setStatements() {
		return null;
		}

}
