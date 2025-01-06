package com.Ornekler_9_14;
import java.util.ArrayList;

public class School 
{
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	private ArrayList<SchoolClass> classes;
		
	public School()
	{
		this.students = new ArrayList<Student>();
		this.teachers= new ArrayList<Teacher>();
		this.classes= new ArrayList<SchoolClass>();
	}
		
	public void addStudents(Student student) 
	{
		students.add(student);
	}
		
	public void removeStudents(Student student)
	{
		students.remove(student);
	} 
		
	public void addTeacher(Teacher teacher)
	{
		teachers.add(teacher);
	}
		
	public void removeTeacher(Teacher teacher)
	{
		teachers.remove(teacher);
	}
		
	public void addClass(SchoolClass schoolClass)
	{
		classes.add(schoolClass);
	}
		
	public void removeClass(SchoolClass schoolClass)
	{
		classes.remove(schoolClass);
	}
		
	public ArrayList<Student> getStudent()
	{
		return students;
	}
		
	public ArrayList<Teacher> getTeacher()
	{
		return teachers;
	}
		
	public ArrayList<SchoolClass> getClasses()
	{
		return classes;
	}
}
