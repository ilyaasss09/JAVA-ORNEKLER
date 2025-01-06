package com.Ornekler_7;
import java.time.LocalDate;
import java.time.Period;
public class Employee2 
{
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public Employee2(String name1, double salary1, LocalDate hireDate1)
	{
		this.name = name1;
		this.salary = salary1;
		this.hireDate = hireDate1;
	}
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name1)
	{
		this.name = name1;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	public void setSalary(double salary1)
	{
		this.salary = salary1;
	}
	
	public LocalDate gethireDate()
	{
		return this.hireDate;
	}
	public void sethireDate(LocalDate hireDate1)
	{
		this.hireDate = hireDate1;
	}
	 
	public int getYearsOfService()
	{
		return Period.between(hireDate, LocalDate.now()).getYears(); 
	}
	
	public void getEmployeesInfo()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		System.out.println("Hire Date: " + this.hireDate);
	}
}
