package week4;

import java.util.Scanner;

public class Rectangle {
	
	public double width;
	public double height;
	
	public Rectangle(double wid, double hei) {
		width = wid;
		height = hei;
	}
	
	public double getArea() {
		double area = width * height;
		return area;
	}

	public static void main(String[] args) {
		/* Declare the class of Rectangle, 
		 * write a program to calculate the area of rectangle
		 * You have to design Fields, Methods and Constructors
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Input width: ");
		double w = sc.nextDouble();
		System.out.print("Input height: ");
		double h = sc.nextDouble();
		Rectangle r = new Rectangle(w,h);
		System.out.println("Area is "+r.getArea());
		sc.close();
	}

}
