package com.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	/*
	 * @Before("execution(public String getName())") public void loggingAdvice() {
	 * System.out.println("Get Method Called"); }
	 */
	
	@Before("execution(*  get*())") //--.Wildcard expression
	public void loggingAdvice() {
		System.out.println("Get Method Called");
	}
	
	@Before("execution(*  get*())") //--.Wildcard expression
	public void secondAdvice() {
		System.out.println("Second Advice....Get Method Called");
	}
	
	

}
