import com.Ornekler_9_11.*;

public class Baslat9_11 
{

	public static void main(String[] args) 
	{
	
		Restaurant restaurant = new Restaurant();
		
		restaurant.addItems("Burger", 8.99);
		restaurant.addItems("Pizza", 9.99);
		restaurant.addItems("Salad", 6.99);
		System.out.println("Menu: Items & Price");
		restaurant.displayMenu();
		
		restaurant.addRating("Burger", 4);
		restaurant.addRating("Burger", 5);
		restaurant.addRating("Pizza", 3);
		restaurant.addRating("Pizza", 4);
		restaurant.addRating("Salad", 2);
		
		double averageRating = restaurant.getAverageRating("Burger");
		System.out.println("\nAverage Rating for Burger: " + averageRating);
		averageRating = restaurant.getAverageRating("Pizza");
		System.out.println("\nAverage Rating for Pizza: " + averageRating);
		averageRating = restaurant.getAverageRating("Salad");
		System.out.println("\nAverage Rating for Salad: " + averageRating);
		System.out.println("\nAverage Rating: " + restaurant.calculateAverageRating());
		
		System.out.println("\nRemove 'Pizza' from the above menu.");
		restaurant.removeItems("Pizza");
		System.out.println("\nUpdated Menu:");
		restaurant.displayMenu();
		
	}
}
