import com.Ornekler_9_13.*;

public class Baslat9_13 
{

	public static void main(String[] args) 
	{
		Inventory inv1 = new Inventory();
		Product prdct1 = new Product("TV",200);
		Product prdct2 = new Product("PC",40);
		Product prdct3 = new Product("Phone",900);
		
		
		
		System.out.println("Inventory is empty!");		
		System.out.println("\n\t*******/ Adding three products in inventory /********");
		
		inv1.addProduct(prdct1);
		inv1.addProduct(prdct2);
		inv1.addProduct(prdct3);
		
		for (Product product: inv1.getProduct())
		{
			System.out.println("Name: " + product.getName() + " Quantity: " + product.getQuantity());
		}
		
		System.out.println("\nCheck low inventory:");
		inv1.checkLowInventory();
		
		System.out.println("\nRemove PC from inventory:");
		inv1.removeProduct(prdct2);
		
		System.out.println("\nCheck again low inventory:");
		inv1.checkLowInventory();
		
		for (Product product: inv1.getProduct())
		{
			System.out.println("Name: " + product.getName() + " Quantity: " + product.getQuantity());
		}
		
		
		
	}

}
