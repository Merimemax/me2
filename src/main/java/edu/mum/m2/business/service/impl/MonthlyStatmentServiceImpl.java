package edu.mum.m2.business.service.impl;


import edu.mum.m2.dao.AccountDAO;
import edu.mum.m2.dao.MonthlyStatmentDAO;
import edu.mum.m2.model.Client;
import edu.mum.m2.model.DailyTransaction;
import edu.mum.m2.model.MonthlyStatment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.m2.service.MonthlyStatmentService;

import java.text.SimpleDateFormat;
import java.util.List;


@Service
@Transactional
public class MonthlyStatmentServiceImpl implements MonthlyStatmentService {

	@Autowired
	private MonthlyStatmentDAO monthlyStatmentDAO;
	
	@Autowired
	private AccountDAO accountDAO;

	//??
public void createMonthlyStatment(MonthlyStatment monthlyCost) {
		monthlyStatmentDAO.save(monthlyCost);
		
	}

	@Override
	public List<MonthlyStatment> findAll() {
		
		return (List<MonthlyStatment>) monthlyStatmentDAO.findAll();
	}

	@Override
	public MonthlyStatment findById(Long id) {
		
		return monthlyStatmentDAO.findOne(id);
	}	
	

	@Override
	public MonthlyStatment generateMonthlyStatment(List<DailyTransaction> dailyTransaction, String forMonth) {
		MonthlyStatment monthlyStatment= null;
		if(dailyTransaction!=null && dailyTransaction.size()>0) {
			monthlyStatment = new MonthlyStatment();
			
			Client client =  dailyTransaction.get(0).getClient();
			String clientName = client.getFirstName()+" "+client.getLastName();
			String accountNo = dailyTransaction.get(0).getAccount().getAccountNo();
			double totalAmount = 0.0;
			String monthlyForMonth= forMonth;
			
			
			
		for(DailyTransaction dt: dailyTransaction) {
			String date = new SimpleDateFormat("yyyy/MMM/dd").format(dt.getTranTime()).toLowerCase();
			String dateShort = forMonth.substring(0, 2).toLowerCase();
			if(date.contains(dateShort)) {
				
				totalAmount += dt.getAmount();
				
			}
		}
		monthlyStatment.setAccountNo(accountNo);
		monthlyStatment.setClientName(clientName);
		monthlyStatment.setForMonth(monthlyForMonth);
		monthlyStatment.setTotalAmount(totalAmount);
	}
		return monthlyStatment;
		
		
	}

	@Override
	public MonthlyStatment findByAccount(String accountNum) {
		
		return monthlyStatmentDAO.findByAccount(accountNum);
	}

	@Override
	public MonthlyStatment findByMonth(String month) {
		
		return monthlyStatmentDAO.findByMonth(month);
	}

	

	

}
