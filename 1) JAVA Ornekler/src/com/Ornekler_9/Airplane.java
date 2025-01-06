package com.Ornekler_9;
import java.time.LocalTime;

public class Airplane 
{
	private String flightNumber;
	private String destination;
	private LocalTime scheduledDeparture;
	private int delayTime;
	
	public Airplane(String flightNumber1, String destination1, LocalTime scheduledDeparture1)
	{
		this.flightNumber = flightNumber1;
		this.destination = destination1;
		this.scheduledDeparture = scheduledDeparture1;
		this.delayTime = 0;
	}
	
	public String getFlightNumber()
	{
		return this.flightNumber;
	}
	public void setFlightNumber(String flightNumber1)
	{
		this.flightNumber = flightNumber1;
	}
	
	public String getDestination()
	{
		return this.destination;
	}
	public void setDestination(String Destination1)
	{
		this.destination = Destination1;
	}
	
	public LocalTime getScheduledDeparture()
	{
		return this.scheduledDeparture;
	}
	public void setScheduledDeparture(LocalTime ScheduledDeparture1)
	{
		this.scheduledDeparture = ScheduledDeparture1;
	}
	
	public int getDelayTime()
	{
		return this.delayTime;
	}
	public void delay(int minutes)
	{
		this.delayTime = minutes;
		this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes); 
	}
	
	public void checkStatus()
	{
		if (delayTime == 0)
		{
			System.out.println("Flight " + this.flightNumber + " is on time.");
		}
		else 
		{
			System.out.println("Flight " + this.flightNumber + " is delayed by " + this.delayTime + " minutes.");
		}
	}
	
	
	
}
