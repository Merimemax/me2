package edu.mum.m2.service;


import edu.mum.m2.model.DailyTransaction;

import java.util.List;

public interface DailyTransactionService {
	
	public void create(DailyTransaction dailyTransaction);
	
	public DailyTransaction findById(Long dailyTransactionId);
	
	public List<DailyTransaction> findAll();
	
	public List<DailyTransaction> getClientTransaction(String clientNum);
	

	
	

}
