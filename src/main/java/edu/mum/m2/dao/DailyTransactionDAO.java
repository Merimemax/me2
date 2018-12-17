package edu.mum.m2.dao;


import edu.mum.m2.model.DailyTransaction;

import java.util.List;

public interface DailyTransactionDAO extends GenericDAO<DailyTransaction>{
	
	List<DailyTransaction> getDailyTransactionByAccount(String accountNum);
	
	 List<DailyTransaction> getDailyTransactionByClient(String clientNum);
	 
	 List<DailyTransaction> getDailyTransactionByMonth(String accountNum);
	 
}
