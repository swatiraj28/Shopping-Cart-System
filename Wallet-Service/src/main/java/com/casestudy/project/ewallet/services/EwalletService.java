package com.casestudy.project.ewallet.services;

import java.util.List;

import com.casestudy.project.ewallet.model.Ewallet;
import com.casestudy.project.ewallet.model.Statement;

public interface EwalletService {

	public List<Ewallet> getWallets();
	public void addMoney();
	public Ewallet update(Ewallet ewal);
	public String getById(String eid);
	public String deleteById(String id);
	public List<Statement> getStatementsById(String id);
	public List<Statement> getStatements();
	Ewallet addWallet(Ewallet ewal);
}
