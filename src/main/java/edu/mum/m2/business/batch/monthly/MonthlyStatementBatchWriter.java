package edu.mum.m2.business.batch.monthly;

import edu.mum.m2.model.MonthlyStatment;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.mum.m2.service.MonthlyStatmentService;

import java.util.List;

@Component
public class MonthlyStatementBatchWriter implements ItemWriter<MonthlyStatment> {

	@Autowired
	private MonthlyStatmentService monthlyTransactionService;

	@Override
	public void write(List<? extends MonthlyStatment> items) throws Exception {
		for (MonthlyStatment monthlyCost : items) {
			monthlyTransactionService.createMonthlyStatment(monthlyCost);
			monthlyTransactionService.createMonthlyStatment(monthlyCost);
		}
	}
}
