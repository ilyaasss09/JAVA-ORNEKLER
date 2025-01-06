import com.Ornekler_7.*;
import java.time.LocalDate;

public class Baslat07 
{

	public static void main(String[] args) 
	{
		
		Employee2 e1 = new Employee2("ilyas",35000,LocalDate.parse("2022-04-22"));
		Employee2 e2 = new Employee2("onur",55000,LocalDate.parse("2024-01-02"));
		Employee2 e3 = new Employee2("alp",45000,LocalDate.parse("1990-08-30"));
		e1.getEmployeesInfo();
		System.out.println("Years of Service: " + e1.getYearsOfService());
		System.out.println();
		e2.getEmployeesInfo();
		System.out.println("Years of Service: " + e2.getYearsOfService());
		System.out.println();
		e3.getEmployeesInfo();
		System.out.println("Years of Service: " + e3.getYearsOfService());
	
	}

}
