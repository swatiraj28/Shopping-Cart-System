package com.casestudy.project.ewallet.model;

import java.time.LocalDateTime;

public class Statement {
	//Variables



	private String statementId;
	private String transactionType;
	private double amount;
	private LocalDateTime dateTime;
	private String orderId;
	private String transactionRemarks;
	public String getStatementId() {
	return statementId;
	}
	public void setStatementId(String statementId) {
	this.statementId = statementId;
	}
	public String getTransactionType() {
	return transactionType;
	}
	public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
	}
	public double getAmount() {
	return amount;
	}
	public void setAmount(double amount) {
	this.amount = amount;
	}
	public LocalDateTime getDateTime() {
	return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
	this.dateTime = dateTime;
	}
	public String getOrderId() {
	return orderId;
	}
	public void setOrderId(String orderId) {
	this.orderId = orderId;
	}
	public String getTransactionRemarks() {
	return transactionRemarks;
	}
	public void setTransactionRemarks(String transactionRemarks) {
	this.transactionRemarks = transactionRemarks;
	}
	public Statement(String statementId, String transactionType, double amount, LocalDateTime dateTime, String orderId,
	String transactionRemarks) {
	super();
	this.statementId = statementId;
	this.transactionType = transactionType;
	this.amount = amount;
	this.dateTime = dateTime;
	this.orderId = orderId;
	this.transactionRemarks = transactionRemarks;
	}
	public Statement() {
	super();
	}
	@Override
	public String toString() {
	return "Statement [statementId=" + statementId + ", transactionType=" + transactionType + ", orderId=" + orderId
	+ ", transactionRemarks=" + transactionRemarks + "]";
	}
	@Override
	public int hashCode() {
		return java.util.Objects.hash(amount, dateTime, orderId, statementId, transactionRemarks, transactionType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Statement other = (Statement) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& java.util.Objects.equals(dateTime, other.dateTime)
				&& java.util.Objects.equals(orderId, other.orderId)
				&& java.util.Objects.equals(statementId, other.statementId)
				&& java.util.Objects.equals(transactionRemarks, other.transactionRemarks)
				&& java.util.Objects.equals(transactionType, other.transactionType);
	}

	
	
	}

