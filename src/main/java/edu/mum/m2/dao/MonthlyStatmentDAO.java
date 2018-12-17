package edu.mum.m2.dao;


import edu.mum.m2.model.MonthlyStatment;

public interface MonthlyStatmentDAO extends GenericDAO<MonthlyStatment>{
	MonthlyStatment findByAccount(String accountNum);
	MonthlyStatment findByMonth(String month);
}
