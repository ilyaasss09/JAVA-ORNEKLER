import com.Ornekler_6.*;

public class Baslat06 
{

	public static void main(String[] args) 
	{
		
		TrafficLights light1 = new TrafficLights("Yellow",5);
		System.out.println("Is the light Red ?: " + light1.isRed());
		System.out.println("Is the light Yellow ?: " + light1.isYellow());
		System.out.println("Is the light Green ?: " + light1.isGreen());
		System.out.println();
		light1.changeColor("Red");
		System.out.println("Is the light Red ?: " + light1.isRed());
		light1.setDuration(30);
		System.out.println("The light duration is: " + light1.getDuration() + " seconds");

	}

}
