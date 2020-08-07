package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	
	
	@Before("allCircleMethods()") 
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
	}
	
	/*
	 * @Before("args(String)") public void argumentMethod() {
	 * System.out.println("An argument is passed"); }
	 */
	
	@Before("args(name)")
	public void argumentMethod(String name ) {
		System.out.println("An argument is passed where value is "+name);
	}
	
	@Pointcut("execution(*  get*())") //--> Run for all advice
	public void allGetters() {}
	
	@Pointcut("within(com.spring.model.Circle)")
	public void allCircleMethods() {}

}
