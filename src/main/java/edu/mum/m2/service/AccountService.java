package edu.mum.m2.service;



import edu.mum.m2.model.Account;

import java.util.List;


public interface AccountService {
	
	public Account findByClient(String clientNo);
	
	public Account findById(Long id);
	
	public List<Account> findAll();
	
	public void save(Account account);

}
