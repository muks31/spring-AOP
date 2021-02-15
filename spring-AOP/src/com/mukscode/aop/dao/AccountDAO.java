package com.mukscode.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println(getClass() + ": Doing My DB Work: Adding an Account");
	}

}
