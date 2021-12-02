package com.casestudy.project.ewallet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.project.ewallet.model.Ewallet;
import com.casestudy.project.ewallet.model.Statement;
import com.casestudy.project.ewallet.repository.EwalletRepository;
import com.casestudy.project.ewallet.repository.StatementsRepository;

public class EwalletServiceImpl implements EwalletService {
	@Autowired // we also use with implemented class
	EwalletRepository EwalRepo;
	
	@Autowired
	StatementsRepository sRepo;

	@Override
	public List<Ewallet> getWallets() {
		return (List<Ewallet>) EwalRepo.findAll();
	}

	@Override
	public Ewallet addWallet(Ewallet ewal) {
		Ewallet ew = EwalRepo.save(ewal);
		return ew;
	}

	@Override
	public void addMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ewallet update(Ewallet ewal) {
		Ewallet ew = EwalRepo.save(ewal);
		return ew;
		
	}

	@Override
	public String getById(String eid) {
		return EwalRepo.findById(eid);
	}

	@Override
	public String deleteById(String id) {
		EwalRepo.deleteById(id);
		return "Ewallet" +id+ "deleted";
		
	}

	@Override
	public List<Statement> getStatementsById(String id) {
		// TODO Auto-generated method stub
		//return (List<Statement>) sRepo.findById(id);
		return null;
	}

	@Override
	public List<Statement> getStatements() {
		
		return (List<Statement>) sRepo.findAll();
	}


}
