package com.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	
	
	@Before("allCircleMethods() ") //--.Wildcard expression
	public void loggingAdvice() {
		System.out.println("Get Method Called");
	}
	
	@AfterReturning(pointcut ="args(name)", returning ="returnString")
	public void argumentMethod(String name, String returnString ) {
		System.out.println("An argument is passed where value is "+name);
		System.out.println("A returned name is  "+returnString);
	}
	
	@AfterThrowing(pointcut = "args(name)", throwing = "excep")
	public void afterMethod(String name, RuntimeException excep  ) {
		System.out.println("An exception thrown "+excep);
	}
	
	@Around("allGetters()")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnvalue = null;
		try {
			System.out.println("Before returning");
			returnvalue = proceedingJoinPoint.proceed();
			System.out.println("After returning");
		}
		catch(Throwable e) {
			System.out.println("After throwing");
		}
		System.out.println("after finally");
		return returnvalue;
	}
	
	@Pointcut("execution(*  get*())") //--> Run for all advice
	public void allGetters() {}
	
	@Pointcut("within(com.spring.model.Circle)")
	public void allCircleMethods() {}

}
