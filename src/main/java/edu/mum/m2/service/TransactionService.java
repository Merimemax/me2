package edu.mum.m2.service;


import edu.mum.m2.model.DailyTransaction;
import edu.mum.m2.model.Transaction;

import java.util.List;

public interface TransactionService {

	
	public Transaction findById(Long transactionID);
	
	public List<Transaction> findAll();
	
	
	List<DailyTransaction> getDailyTransactionByAccount(String accountNum);
	
	List<DailyTransaction> getDailyTransactionByClient(String clientNum);
	
	public void createTransaction(Transaction transaction);
	
	public void createDailyTransaction(DailyTransaction dailyTran);
	
}
