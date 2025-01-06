import com.Ornekler_9_14.*;

public class Baslat9_14 
{

	public static void main(String[] args)
	{
		School school = new School();
		
		Student s1 = new Student("İlyas",20);
		Student s2 = new Student("Alp",19);
		Student s3 = new Student("Onur",21);
		Student s4 = new Student("Mustafa",20);
		
		school.addStudents(s1);
		school.addStudents(s2);
		school.addStudents(s3);
		school.addStudents(s4);
		
		Teacher t1 = new Teacher("Güney Gürsel","OOP Java");
		Teacher t2 = new Teacher("Canan BÜyükgoğan","Intermeditate English");
		Teacher t3 = new Teacher("Özlem Acar","Mathematics");
		
		school.addTeacher(t1);
		school.addTeacher(t2);
		school.addTeacher(t3);
		
		SchoolClass javaClass = new SchoolClass("OOP Java", t1);
		javaClass.addStudent(s1);
		javaClass.addStudent(s2);
		javaClass.addStudent(s3);
		javaClass.addStudent(s4);
		
		SchoolClass intermeditateEnglish = new SchoolClass("Intermeditate English", t2);
		intermeditateEnglish.addStudent(s1);
		intermeditateEnglish.addStudent(s2);
		intermeditateEnglish.addStudent(s3);
		intermeditateEnglish.addStudent(s4);
		
		SchoolClass mathematics = new SchoolClass("Mathematics", t3);
		mathematics.addStudent(s1);
		mathematics.addStudent(s2);
		mathematics.addStudent(s3);
		mathematics.addStudent(s4);
		
		
		school.addClass(javaClass);
		school.addClass(intermeditateEnglish);
		school.addClass(mathematics);
		
		
		System.out.println("SCHOOL INFORMATION:");
		System.out.println();

		System.out.println("Number of Students: " + school.getStudent().size());
		System.out.println("Number of Teachers: " + school.getTeacher().size());
		System.out.println("Number of Classes: " + school.getClasses().size());
		System.out.println();

		System.out.println("OOP Java Class Information:");
		System.out.println("Class Name: " + javaClass.getClassName());
		System.out.println("Teacher: " + javaClass.getTeacher());
		System.out.println("Number of Students: " + javaClass.getStudent().size());
		System.out.println();
		
		System.out.println("Intermeditate English Class Information:");
		System.out.println("Class Name: " + intermeditateEnglish.getClassName());
		System.out.println("Teacher: " + intermeditateEnglish.getTeacher());
		System.out.println("Number of Students: " + intermeditateEnglish.getStudent().size());
		System.out.println();
		
		System.out.println("Mathematics Class Information:");
		System.out.println("Class Name: " + mathematics.getClassName());
		System.out.println("Teacher: " + mathematics.getTeacher());
		System.out.println("Number of Students: " + mathematics.getStudent().size());
		System.out.println();
		
		school.removeStudents(s4);
		school.removeTeacher(t3);
		school.removeClass(mathematics);
		
		System.out.println("School information after removing 1 student, 1 teacher and 1 class: ");
		System.out.println("Number of Students: " + school.getStudent().size());
		System.out.println("Number of Teachers: " + school.getTeacher().size());
		System.out.println("Number of Classes: " + school.getClasses().size());
		
		
		
		
		
		
	}

}
