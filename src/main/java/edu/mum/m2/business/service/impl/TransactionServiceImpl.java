package edu.mum.m2.business.service.impl;


import edu.mum.m2.dao.DailyTransactionDAO;
import edu.mum.m2.dao.TransactionDAO;
import edu.mum.m2.model.DailyTransaction;
import edu.mum.m2.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.m2.service.TransactionService;

import java.util.List;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionDAO transactionDAO;
	@Autowired
	private DailyTransactionDAO dailyTransactionDAO;

	@Override
	public void createTransaction(Transaction summary) {
		transactionDAO.save(summary);
		
	}

	@Override
	public Transaction findById(Long transactionID) {
		
		return transactionDAO.findOne(transactionID);
	}

	@Override
	public List<Transaction> findAll() {
		
		return transactionDAO.findAll();
	}

	@Override
	public List<DailyTransaction> getDailyTransactionByAccount(String accountNum) {
				
		
		return dailyTransactionDAO.getDailyTransactionByAccount(accountNum);
	}

	@Override
	public List<DailyTransaction> getDailyTransactionByClient(String clientNum) {
		
		return dailyTransactionDAO.getDailyTransactionByClient(clientNum) ;
	}

	@Override
	public void createDailyTransaction(DailyTransaction dailyTran) {
		
		dailyTransactionDAO.save(dailyTran);
	}

	

}
