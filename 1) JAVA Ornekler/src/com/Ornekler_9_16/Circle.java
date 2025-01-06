package com.Ornekler_9_16;

public class Circle extends Shape
{
	private double radius;
	
	public Circle(double radius1)
	{
		this.radius = radius1;
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	
	
}
