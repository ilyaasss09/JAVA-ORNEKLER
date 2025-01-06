import com.Ornekler_2.Dog;

public class Baslat02 
{

	public static void main(String[] args)
	{

		
		Dog d1 = new Dog("Buffy","Golden");
		Dog d2 = new Dog("Charlie","Pitbull");
		System.out.println(d1.getName() + " is a " + d1.getBreed());
		System.out.println(d2.getName() + " is a " + d2.getBreed());
		System.out.println("\"****** NEW ATTRIBUTES ******\"");
		d1.setName("Tommy");
		d2.setBreed("Bulldog");
		System.out.println(d1.getName() + " is a " + d1.getBreed());
		System.out.println(d2.getName() + " is a " + d2.getBreed());
		

	}

}
