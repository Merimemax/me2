package edu.mum.m2.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(* edu.mum.m2.service..*(..))")
		public void applicationMethod() {
	}
	
	@Pointcut("execution(* edu.mum.m2.dao..*(..))")
		public void daoMethod() {
	}

	@Before("applicationMethod() || daoMethod()")
	public void logResource(JoinPoint joinPoint) {
		Logger log = Logger.getLogger("");

		log.info("   **********     TARGET CLASS : " + joinPoint.getSignature().getDeclaringTypeName() + "#"
				+ joinPoint.getSignature().getName() + "    **********");

		System.out.println("   **********     TARGET CLASS : " + joinPoint.getSignature().getDeclaringTypeName() + "#"
				+ joinPoint.getSignature().getName() + "    **********");
	}

}
