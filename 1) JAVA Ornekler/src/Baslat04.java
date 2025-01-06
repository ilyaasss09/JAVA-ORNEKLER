import com.Ornekler_4.*;

public class Baslat04 
{

	public static void main(String[] args) 
	{
		
		Circle c1 = new Circle(5);
		System.out.println("The radius of c1 is = " + c1.getRadius());
		c1.setRadius(7);
		System.out.println("The new radius of c1 is = " + c1.getRadius());
		System.out.println("The area of c1 is = " + Math.PI*c1.getRadius()*c1.getRadius());
		System.out.println("The circumference of c1 is = " + 2*Math.PI*c1.getRadius());
		

	}

}
