package com.Ornekler_9_14;

public class Teacher 
{
	private String name;
	private String subject;
	
	public Teacher(String name1, String subject1)
	{
		this.name = name1;
		this.subject = subject1;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name1)
	{
		this.name = name1;
	}
	
	public String getSubject()
	{
		return subject;
	}
	public void setSubject(String subject1)
	{
		this.subject= subject1;
	}
}
