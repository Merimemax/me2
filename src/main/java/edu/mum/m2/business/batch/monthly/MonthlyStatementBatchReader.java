package edu.mum.m2.business.batch.monthly;


import edu.mum.m2.model.MonthlyStatment;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.mum.m2.service.DailyTransactionService;
import edu.mum.m2.service.MonthlyStatmentService;

import javax.annotation.PostConstruct;

@Component
public class MonthlyStatementBatchReader implements ItemReader<MonthlyStatment> {

	@Autowired
	private DailyTransactionService dailyTransactionService;

	@Autowired
	private MonthlyStatmentService monthlyTransactionService;

	@PostConstruct
	private void init() {

	}

	@Override
	public MonthlyStatment read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

		return null;
	}

}
