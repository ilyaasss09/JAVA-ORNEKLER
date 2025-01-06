import com.Ornekler_8.*;

public class Baslat08 
{

	public static void main(String[] args) 
	{
		
		Student s1 = new Student("ILYAS",3);
		Student s2 = new Student("ALP",2);
		Student s3 = new Student("ONUR",1);
		System.out.println("*****/ Student Details /*****");
		System.out.println();
		s1.studentInfo();
		System.out.println();
		s2.studentInfo();
		System.out.println();
		s3.studentInfo();
		System.out.println();
		System.out.println("Adding course for " + s3.name + ":");
		s3.addCourse("Calculus-1");
		s3.addCourse("Physics-1");
		System.out.println(s3.name + "'s courses: " + s3.courses);
		System.out.println();
		System.out.println("Adding course for " + s2.name + ":");
		s2.addCourse("OOP Java");
		s2.addCourse("History Of Turkish Republic");
		s2.addCourse("Intermeditate English");
		System.out.println(s2.name + "'s courses: " + s2.courses);
		System.out.println();
		System.out.println("Removing 'Physics-1' course for " + s3.name + ":");
		s3.removeCourse("Physics-1");
		System.out.println(s3.name + "'s courses: " + s3.courses);

	}

}
