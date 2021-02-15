package com.mukscode.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
	
	//this is where we add all our related advices for logging
	
	//Let's start with an @Before
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void com.mukscode.aop.dao.AccountDAO.addAccount())")
	//@Before("execution(public void add*())")
	//@Before("execution(void add*())")
	@Before("execution(* add*())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=======>>>>> Executing @Before Advice on method");
	}

}
