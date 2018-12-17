package edu.mum.m2.business.service.impl;

import edu.mum.m2.dao.DailyTransactionDAO;
import edu.mum.m2.model.DailyTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.m2.service.DailyTransactionService;

import java.util.List;

@Service
@Transactional
public class DailyTransactionServiceImpl implements DailyTransactionService {

	@Autowired
	private DailyTransactionDAO dailyTransactionDAO;
	/*@Autowired
	private DailyTransactionDAO dailyTransactionDAO;*/

	@Override
	public void create(DailyTransaction dailyTransaction) {
		dailyTransactionDAO.save(dailyTransaction);
		
	}

	@Override
	public DailyTransaction findById(Long dailyTransactionId) {
		
		return dailyTransactionDAO.findOne(dailyTransactionId);
	}

	@Override
	public List<DailyTransaction> findAll() {
		
		return (List<DailyTransaction>) dailyTransactionDAO.findAll();
	}

	@Override
	public List<DailyTransaction> getClientTransaction(String clientNum) {
		
		return dailyTransactionDAO.getDailyTransactionByClient(clientNum);
		
	}

	

	

}
