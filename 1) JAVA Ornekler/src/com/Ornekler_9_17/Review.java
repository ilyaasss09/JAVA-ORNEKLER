package com.Ornekler_9_17;

public class Review 
{
	private String reviewText;
    private String reviewerName;
    private double rating;
    
    public Review(String reviewText1, String reviewerName1, double rating1)
    {
    	this.reviewText = reviewText1;
    	this.reviewerName = reviewerName1;
    	this.rating = rating1;
    }
    
    public String getReviewText()
    {
    	return this.reviewText;
    }
    
    public String getReviewerName()
    {
    	return this.reviewerName;
    }
    
    public double getRating()
    {
    	return this.rating;
    }
 
}
