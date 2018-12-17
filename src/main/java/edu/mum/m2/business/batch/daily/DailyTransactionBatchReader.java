package edu.mum.m2.business.batch.daily;

import edu.mum.m2.model.Transaction;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.mum.m2.service.DailyTransactionService;
import edu.mum.m2.service.TransactionService;

import javax.annotation.PostConstruct;

@Component
public class DailyTransactionBatchReader implements ItemReader<Transaction> {

	@Autowired
	private DailyTransactionService dailyTransactionService;

	@Autowired
	private TransactionService transactionService;


	@PostConstruct
	private void init() {
		
	}

	@Override
	public Transaction read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		return null;
	}

	

}
