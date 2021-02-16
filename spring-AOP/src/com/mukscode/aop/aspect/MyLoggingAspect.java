package com.mukscode.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
	
	//this is where we add all our related advices for logging
	
	//Let's start with an @Before
	//@Before("execution(public void addAccount())") -- For any addAccount method
	//@Before("execution(public void com.mukscode.aop.dao.AccountDAO.addAccount())") -- For a specific addAccount method of specified class
	//@Before("execution(public void add*())") -- For any method that starts with add
	//@Before("execution(void add*())") -- for any method that starts with add and since access modifier is optional we are not using this
	@Before("execution(* add*())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=======>>>>> Executing @Before Advice on method");
	}

}
