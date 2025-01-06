import com.Ornekler_9.*;
import java.time.LocalTime;

public class Baslat09 
{

	public static void main(String[] args) 
	{
		
		Airplane flight1 = new Airplane("Q5981","ISTANBUL",LocalTime.of(10,30));
		Airplane flight2 = new Airplane("C83JS","LONDON",LocalTime.of(22,15));
		Airplane flight3 = new Airplane("KJ5SL","TOKYO",LocalTime.of(14,00));
		Airplane flight4 = new Airplane("SJ23O","MADRID",LocalTime.of(19,45));
		System.out.println("Flight Status:");
		flight1.checkStatus();
		flight2.checkStatus();
		flight3.checkStatus();
		flight4.checkStatus();
		flight1.delay(30);
		flight3.delay(150);
		System.out.println("\nCurrent Flight Status:");
		flight1.checkStatus();
		flight2.checkStatus();
		flight3.checkStatus();
		flight4.checkStatus();
		

	}

}
