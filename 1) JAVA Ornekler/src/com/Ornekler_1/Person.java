package com.Ornekler_1;

public class Person 
{
	public String name;
	public int age;
	
	public Person(String name1,int age1)
	{
		this.name = name1;
		this.age = age1;
	}
	
	public void display()
	{
		System.out.printf("Name: %s\tAge: %d ", name,age);
	}

}
