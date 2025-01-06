package com.Ornekler_9_13;

public class Product 
{
	private String name;
	private int quantity;
	
	
	public Product(String name1, int quantity1)
	{
		this.name = name1;
		this.quantity = quantity1;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name1)
	{
		this.name = name1;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity1)
	{
		this.quantity = quantity1;
	}
	
}
