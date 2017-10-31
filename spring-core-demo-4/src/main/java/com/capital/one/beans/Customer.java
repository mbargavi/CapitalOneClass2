package com.capital.one.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Customer {	
	@Value("John Smith")
	private String name;
	
	@Value("100000")
	private int id;
	
	@Autowired
	private CheckingAccount chkacct;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setChkacct(CheckingAccount chkacct) {
		this.chkacct = chkacct;
	}
	
	public void deposit(double deposit) {
		chkacct.setBalance(deposit);
	}
	
	public void report() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Balance: $" + chkacct.getBalance());
	}
	
	@PostConstruct
	public void initBalance() {
		chkacct.setBalance(0);
	}
	
	@PreDestroy
	public void closeAccount() {
		System.out.println("Account is now closed.");
		System.out.println("Closing Balance: $" + chkacct.getBalance());
	}

}
