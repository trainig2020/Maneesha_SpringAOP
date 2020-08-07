package com.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnvalue = null;
		try {
			System.out.println("Before returning");
			returnvalue = proceedingJoinPoint.proceed();
			System.out.println("After returning");
		} catch (Throwable e) {
			System.out.println("After throwing");
		}
		System.out.println("after finally");
		return returnvalue;
	}

	public void loggingAdvice() {
		System.out.println("AOP proxy advice");
	}
	

}
