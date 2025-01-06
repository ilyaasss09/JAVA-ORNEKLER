package com.Ornekler_9_11;
import java.util.ArrayList;

public class Restaurant 
{
	private ArrayList menuItems;
	private ArrayList prices;
	private ArrayList rating;
	private ArrayList itemCounts;
	
	public Restaurant()
	{
		this.menuItems = new ArrayList();
		this.prices = new ArrayList();
		this.rating = new ArrayList();
	}
	
	public void addItems(String item, double price)
	{
		this.menuItems.add(item);
		this.prices.add(prices);
		this.rating.add(0);
		this.itemCounts.add(0);
	}
	
	public void removeItems(String item)
	{
		int index = this.menuItems.indexOf(item);
		if (index >= 0)
		{
			this.menuItems.remove(index);
			this.prices.remove(index);
			this.rating.remove(index);
			this.itemCounts.remove(index);
		}
	}
	
	public void addRating(String item, int rating)
	{
		int index = this.menuItems.indexOf(item);
		if (index >= 0)
		{
			Object currentRating = this.rating.get(index);
			Object totalCount = this.itemCounts.get(index);
			this.rating.set(index, (int) currentRating + rating);
			this.itemCounts.set(index, (int) totalCount + 1);
		}
	}
	
	public double getAverageRating(String item)
	{
		int index = this.menuItems.indexOf(item);
		if (index >= 0)
		{
			Object totalRating = this.rating.get(index);
			Object itemCount = this.itemCounts.get(index);
			return (int) itemCount >  0 ? (double) totalRating / (double) itemCount : 0.0;
		}
		else
		{
			return 0.0;
		}
	}
	
	public void displayMenu()
	{
		for (int i = 0; i < menuItems.size(); i ++ )
		{
			System.out.println(menuItems.get(i) + ": $" + prices.get(i));
		}
	}
	
	public double calculateAverageRating()
	{
		double totalRating = 0;
		int numRating = 0;
		for (int i = 0; i < rating.size(); i++)
		{
			totalRating += (double) rating.get(i);
			numRating++;
		}
		return numRating > 0 ? totalRating / numRating : 0.0;
	}
}