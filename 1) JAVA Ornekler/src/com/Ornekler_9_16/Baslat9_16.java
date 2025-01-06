package com.Ornekler_9_16;

public class Baslat9_16 
{

	public static void main(String[] args) 
	{
		Rectangle rec1 = new Rectangle(14,9.2);
		Circle cir1 = new Circle(5);
		Triangle tri1 = new Triangle(6,8,10);
		
		System.out.println("Area and Perimeter of Shapes: ");
		System.out.println("\nRectangle: ");
		System.out.println("\nArea: " + rec1.getArea());
		System.out.println("\nPerimeter: " + rec1.getPerimeter());
		System.out.println();
		System.out.println("\nCircle: ");
		System.out.println("\nArea: " + cir1.getArea());
		System.out.println("\nPerimeter: " + cir1.getPerimeter());
		System.out.println();
		System.out.println("\nTriangle: ");
		System.out.println("\nArea: " + tri1.getArea());
		System.out.println("\nPerimeter: " + tri1.getPerimeter());
		
	}

}
