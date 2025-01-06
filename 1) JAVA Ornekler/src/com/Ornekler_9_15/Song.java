package com.Ornekler_9_15;

public class Song 
{
	private String title;
	private String artist;
	
	public Song(String title1, String artist1)
	{
		this.title = title1;
		this.artist = artist1;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	public void setTitle(String title1)
	{
		this.title = title1;
	}
	
	public String getArtist()
	{
		return this.artist;
	}
	public void setArtist(String artist1)
	{
		this.artist = artist1;
	}

}
