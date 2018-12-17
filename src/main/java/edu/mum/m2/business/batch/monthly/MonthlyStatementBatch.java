package edu.mum.m2.business.batch.monthly;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class MonthlyStatementBatch {

	@Autowired
	@Qualifier("monthlyStatementJob")
	private Job generateMonthlyStatement;

	@Autowired
	private JobLauncher jobLauncher;
	
	// Disabled for testing as it interrupted the restart test
	// @Scheduled(fixedDelay= 15000, initialDelay=2000)
	public void startjob() throws Exception {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Starting batch " + dateFormat.format(date));

		JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
		jobParametersBuilder.addDate("date", new Date());
		JobParameters jobParameters = jobParametersBuilder.toJobParameters();
		JobExecution jobExecution = jobLauncher.run(generateMonthlyStatement, jobParameters);

		JobInstance jobInstance = jobExecution.getJobInstance();
		System.out.println("job instance Id: " + jobInstance.getId());
	}

}
