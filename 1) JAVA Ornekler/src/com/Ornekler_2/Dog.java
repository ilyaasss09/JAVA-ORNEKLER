package com.Ornekler_2;

public class Dog 
{
	private String name;
	private String breed;
	
	public Dog(String name1,String breed1)
	{
		this.breed = breed1;
		this.name = name1;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name1)
	{
		this.name = name1;
	}
	
	public String getBreed()
	{
		return this.breed;
	}
	public void setBreed(String breed1)
	{
		this.breed = breed1;
	}
	
	

}
