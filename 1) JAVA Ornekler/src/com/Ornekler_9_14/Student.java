package com.Ornekler_9_14;

public class Student 
{
	private String name;
	private int age;
	
	public Student(String name1, int age1)
	{
		this.name = name1;
		this.age = age1;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name1)
	{
		this.name = name1;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age1)
	{
		this.age = age1;
	}
}
