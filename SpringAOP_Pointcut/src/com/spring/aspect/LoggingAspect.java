package com.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	
	
	@Before("allCircleMethods() && allGetters()") //--.Wildcard expression
	public void loggingAdvice() {
		System.out.println("Get Method Called");
	}
	
	@Before("allGetters()") //--.Wildcard expression
	public void secondAdvice() {
		System.out.println("Second Advice....Get Method Called");
	}
	
	@Pointcut("execution(*  get*())") //--> Run for all advice
	public void allGetters() {}
	
	@Pointcut("within(com.spring.model.Circle)")
	public void allCircleMethods() {}

}
