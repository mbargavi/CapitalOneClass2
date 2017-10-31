package com.capital.one.beans;

public class Customer {	
	private String name;
	private int id;
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
	
	public void initBalance() {
		chkacct.setBalance(0);
	}
	
	public void closeAccount() {
		System.out.println("Account is now closed.");
		System.out.println("Closing Balance: $" + chkacct.getBalance());
	}

}
