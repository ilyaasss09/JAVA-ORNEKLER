package com.Ornekler_9_13;
import java.util.ArrayList;

public class Inventory 
{
	private ArrayList<Product> products;
	
	public Inventory()
	{
		products = new ArrayList<Product>();
	}
	
	public void addProduct(Product product)
	{
		products.add(product);
	}
	public void removeProduct(Product product)
	{
		products.remove(product);
	}
	
	public ArrayList<Product> getProduct()
	{
		return products; 
	}
	
	public void checkLowInventory()
	{
		for(Product product: products)
		{
			if (product.getQuantity() <= 100)
			{
				System.out.println(product.getName() + " is running low on inventory. Current quantity: " + product.getQuantity());
			}
			 
		}
	}
	
}
