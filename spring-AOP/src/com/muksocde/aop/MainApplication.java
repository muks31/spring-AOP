package com.muksocde.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mukscode.aop.dao.AccountDAO;

public class MainApplication {

	public static void main(String[] args) {
		
		//read spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		//get the bean from spring container
		AccountDAO theAcctDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//call the business method
		theAcctDAO.addAccount();
		
		
		//do it again
		System.out.println("\n Let's call it again! \n");
		theAcctDAO.addAccount();
		
		//close the context
		context.close();

	}

}
