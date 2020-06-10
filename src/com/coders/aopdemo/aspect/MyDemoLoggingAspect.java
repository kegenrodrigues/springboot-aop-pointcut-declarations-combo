package com.coders.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Pointcut("execution(* com.coders.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {};
	
	
	@Before("forDaoPackage()")
	public void runBeforeAddAccount() {
		System.out.println("Buddy we are in the logging Aspect. runBeforeAddAccount");
	}
	
	
	
	@Before("forDaoPackage()")
	public void preApiAnalytics() {
		System.out.println("Buddy we are in the logging Aspect. preApiAnalytics going on");
	}
}
