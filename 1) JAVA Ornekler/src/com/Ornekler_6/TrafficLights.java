package com.Ornekler_6;

public class TrafficLights 
{
	private String color;
	private int duration;
	
	public TrafficLights(String color1, int duration1)
	{
		this.color = color1;
		this.duration = duration1;
	}

	public void changeColor(String newColor)
	{
		color = newColor;
	}
	
	public boolean isRed()
	{
		return color.equals("Red");
	}
	public boolean isYellow()
	{
		return color.equals("Yellow");
	}
	public boolean isGreen()
	{
		return color.equals("Green");
	}
	
	public int getDuration()
	{
		return this.duration;
	}
	
	public void setDuration(int duration1)
	{
		this.duration = duration1;
	}











}

