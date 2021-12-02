package com.casestudy.project.ewallet.controller;

import java.util.Objects;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/ewallet")
public class WalletResource {
	
	private String deposit;
	private String withdraw;
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(String withdraw) {
		this.withdraw = withdraw;
	}
	public WalletResource(String deposit, String withdraw) {
		super();
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	public WalletResource() {
		super();
	}
	@Override
	public String toString() {
		return "WalletResource [deposit=" + deposit + ", withdraw=" + withdraw + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(deposit, withdraw);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WalletResource other = (WalletResource) obj;
		return Objects.equals(deposit, other.deposit) && Objects.equals(withdraw, other.withdraw);
	}



}
