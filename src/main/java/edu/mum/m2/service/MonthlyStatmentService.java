package edu.mum.m2.service;


import edu.mum.m2.model.DailyTransaction;
import edu.mum.m2.model.MonthlyStatment;

import java.util.List;

public interface MonthlyStatmentService {

	public List<MonthlyStatment> findAll();
	public MonthlyStatment findById(Long id);
	public MonthlyStatment findByAccount(String accountNum);
	public MonthlyStatment findByMonth(String month);
	public MonthlyStatment generateMonthlyStatment(List<DailyTransaction> dailyTransaction, String forMonth);

	void createMonthlyStatment(MonthlyStatment monthlyCost);
}
