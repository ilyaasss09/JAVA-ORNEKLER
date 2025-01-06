package com.Ornekler_9_14;
import java.util.ArrayList;

public class SchoolClass 
{
	private String className;
	private Teacher teacher;
	private ArrayList<Student> students;
	
	public SchoolClass(String className1, Teacher teacher1)
	{
		this.className = className1;
		this.teacher = teacher1;
		this.students = new ArrayList<Student>();
	}
	
	public String getClassName()
	{
		return className;
	}
	public void setClassName(String className1)
	{
		this.className = className1;
	}
	
	public Teacher getTeacher()
	{
		return teacher; 
	}
	public void setTeacher(Teacher teacher1)
	{
		this.teacher = teacher1;
	}
	
	public ArrayList<Student> getStudent()
	{
		return students;
	}
	
	public void addStudent(Student student)
	{
		students.add(student);
	}
	public void removeStudent(Student student)
	{
		students.remove(student);
	}
}
