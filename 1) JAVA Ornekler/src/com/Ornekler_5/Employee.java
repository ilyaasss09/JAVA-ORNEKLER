package com.Ornekler_5;

public class Employee 
{
	public String name;
	public String jobTitle;
	public double salary;
	
	public Employee(String name1,String jobTitle1,double salary1)
	{
		this.name=name1;
		this.jobTitle=jobTitle1;
		this.salary=salary1;
	}
	
	public void raiseSalary(double percentage)
	{
		salary = salary + salary * percentage / 100;
	}
	
	public void employeeDetails()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Job Title: " + this.jobTitle);
		System.out.println("Salary: " + this.salary);
	}

}
