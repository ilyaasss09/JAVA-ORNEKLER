package com.Ornekler_3;

public class Rectangle 
{
	private double width;
	private double height;
	
	public Rectangle(double width1, double height1)
	{
		this.width = width1;
		this.height = height1;
	}
	 
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	public void setWidth(double width1)
	{
		this.width = width1;
	}
	public void setHeight(double height1)
	{
		this.height= height1;
	}
	
	public void Area()
	{
		System.out.println("Area of Rectangle is = " + width*height);
	}
	public void Perimeter()
	{
		System.out.println("Perimeter of Rectangle is = " + (width+height)*2);
	}
}
