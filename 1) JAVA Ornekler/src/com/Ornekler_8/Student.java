package com.Ornekler_8;
import java.util.ArrayList;
public class Student 
{
	public String name;
	public int grade;
	public ArrayList courses;
	
	public Student(String name1, int grade1)
	{
		this.name = name1;
		this.grade = grade1;
		this.courses = new ArrayList();
	}
	
	public ArrayList getCourses()
	{
		return courses;
	}
	
	public void addCourse(String course1)
	{
		courses.add(course1);
	}
	public void removeCourse(String course1)
	{
		courses.remove(course1);
	}
	
	public void studentInfo()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Grade: " + this.grade);
	}
	
	

}
