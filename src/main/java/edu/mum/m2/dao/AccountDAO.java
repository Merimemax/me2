package edu.mum.m2.dao;


import edu.mum.m2.model.Account;

public interface AccountDAO extends GenericDAO<Account>{
	public Account findByClient(String clientNo);
	
	

}
