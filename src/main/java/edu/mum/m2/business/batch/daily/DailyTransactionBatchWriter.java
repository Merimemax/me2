package edu.mum.m2.business.batch.daily;

import edu.mum.m2.model.Transaction;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.mum.m2.service.TransactionService;

import java.util.List;

@Component
public class DailyTransactionBatchWriter implements ItemWriter<Transaction> {

	@Autowired
	private TransactionService transactionService;

	@Override
	public void write(List<? extends Transaction> transactions) throws Exception {
		for (Transaction summary : transactions) {
			this.transactionService.createTransaction(summary);
		}
	}
}
