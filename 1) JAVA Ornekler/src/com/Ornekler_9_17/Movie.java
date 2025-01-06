package com.Ornekler_9_17;
import java.util.ArrayList;

public class Movie 
{
	private String title;
	private String director;
	private ArrayList<String> actors;
	private ArrayList<Review> reviews;
	
	public Movie(String title1, String director1, ArrayList<String> actors1)
	{
		this.title = title1;
		this.director = director1;
		this.actors = actors1;
		this.reviews = new ArrayList<Review>();
	}
	
	public void addReview(Review review)
	{ 
		this.reviews.add(review);
	}
	
	public ArrayList<Review> getReviews()
	{
		return this.reviews;
	}
	
	public String getTitle()
	{
		return this.title;
	}

	public String getDirector()
	{
		return this.director;
	}
	
	public ArrayList<String> getActor()
	{
		return this.actors;
	}
}
	
