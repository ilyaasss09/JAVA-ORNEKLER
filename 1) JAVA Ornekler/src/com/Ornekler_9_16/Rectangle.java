package com.Ornekler_9_16;

public class Rectangle extends Shape
{
	private double length;
	private double width;
	
	public Rectangle(double length1, double width1)
	{
		this.length = length1;
		this.width = width1;
	}
	
	public double getArea()
	{
		return length * width;
	}
	
	public double getPerimeter()
	{
		return 2 * (length + width);
	}

}

