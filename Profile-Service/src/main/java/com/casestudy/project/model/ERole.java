package com.casestudy.project.model;

public class ERole {
	private String ROLE_CUSTOMER;
	
	private String ROLE_MERCHANT;

	public String getROLE_CUSTOMER() {
		return ROLE_CUSTOMER;
	}

	public void setROLE_CUSTOMER(String rOLE_CUSTOMER) {
		ROLE_CUSTOMER = rOLE_CUSTOMER;
	}

	public String getROLE_MERCHANT() {
		return ROLE_MERCHANT;
	}

	public void setROLE_MERCHANT(String rOLE_MERCHANT) {
		ROLE_MERCHANT = rOLE_MERCHANT;
	}

	public ERole(String rOLE_CUSTOMER, String rOLE_MERCHANT) {
		super();
		ROLE_CUSTOMER = rOLE_CUSTOMER;
		ROLE_MERCHANT = rOLE_MERCHANT;
	}

	public ERole() {
		super();
	}

	@Override
	public String toString() {
		return "ERole [ROLE_CUSTOMER=" + ROLE_CUSTOMER + ", ROLE_MERCHANT=" + ROLE_MERCHANT + "]";
	}
	
	
}
