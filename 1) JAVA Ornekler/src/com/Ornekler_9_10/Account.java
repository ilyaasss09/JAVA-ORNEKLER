package com.Ornekler_9_10;

public class Account 
{
	private String name;
	private int accountNumber;
	private double balance;
	
	public Account(String name1, int accountNumber1, double balance1)
	{
		this.name = name1;
		this.accountNumber = accountNumber1;
		this.balance = balance1;
	}
	 
	public String getName()
	{
		return this.name;
	}
	public void setName(String name1)
	{
		this.name = name1;
	}
	
	public int getAccountNumber()
	{
		return this.accountNumber;
	}
	public void setAccountNumber(int accountNumber1)
	{
		this.accountNumber = accountNumber1;
	}
	public void setBalance(double balance1)
	{
		this.balance = balance1;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public String getAccountInfo()
	{
		return "Name: " + this.name + " Account Number: " + this.accountNumber + " Balance: " + this.balance;
	}

 
 

}


