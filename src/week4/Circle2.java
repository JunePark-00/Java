package week4;

import java.util.Scanner;

public class Circle2 {
	public double radius;
	
	public Circle2() {
		radius = 3.0;
	}
	
	public double getArea() {
		double area = 3.14*radius*radius;
		return area;
	}

	public static void main(String[] args) {
		Circle2 c = new Circle2();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(c.getArea());
		
		c.radius = sc.nextDouble();
		System.out.println(c.getArea());
		sc.close();
	}

}
