package com.Ornekler_9_12;

public class Book 
{ 
	private String title;
	private String author;
	
	public Book(String title1, String author1)
	{
		this.title = title1;
		this.author = author1;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title1)
	{
		this.title = title1;
	}
	
	public String getAuthor()
	{
		return author; 
	}
	
	public void setAuthor(String author1)
	{
		this.author= author1;
	}
}
