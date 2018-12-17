package edu.mum.m2.business.service.impl;


import edu.mum.m2.dao.AccountDAO;
import edu.mum.m2.dao.ClientDAO;
import edu.mum.m2.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.m2.service.AccountService;

import java.util.List;


@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO accountDAO;
	
	@Autowired
	private ClientDAO clientDAO;
	
	
	@Override
	public Account findByClient(String clientNo) {
		
		return accountDAO.findByClient(clientNo);
		
	}

	@Override
	public Account findById(Long id) {
		
		return accountDAO.findOne(id);
	}

	@Override
	public List<Account> findAll() {
		
		return (List<Account>) accountDAO.findAll();
	}

	@Override
	public void save(Account account) {
		
		accountDAO.save(account);
		
	}

	

}
