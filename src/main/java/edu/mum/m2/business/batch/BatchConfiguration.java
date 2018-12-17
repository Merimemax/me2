package edu.mum.m2.business.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableBatchProcessing(modular = false)
@EnableScheduling
public class BatchConfiguration {
}
