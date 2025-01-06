import com.Ornekler_5.*;

public class Baslat05 
{

	public static void main(String[] args) 
	{
		
		Employee e1 = new Employee("ilyas","mühendis",90000);
		Employee e2 = new Employee("tezcan","laborant",40000);
		System.out.println("Details of the employees");
		System.out.println();
		e1.employeeDetails();
		System.out.println();
		e2.employeeDetails();
		e1.raiseSalary(10);
		e2.raiseSalary(8);
		System.out.println("\nEmployees details after the raise");
		System.out.println("\n%10 raise for İlyas");
		e1.employeeDetails();
		System.out.println("\n%8 raise for Tezcan");
		e2.employeeDetails();
		
		

	}

}
