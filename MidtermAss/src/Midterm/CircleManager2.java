package Midterm;

import java.util.Scanner;

class Circle2{
	public double x,y;
	public int radius;
	public Circle2(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("("+x+", "+y+") r = "+radius);
	}
}

public class CircleManager2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle2 c[] = new Circle2[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("x,y,radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle2(x,y,radius);
		}
		Circle2 max = c[0];
		for(int i = 0; i < c.length; i++) {
			c[i].show();
			if(c[i].radius > max.radius) {
				max = c[i];
			}
		}
		
		System.out.println("Biggest circle is ("+max.x+", "+max.y+") r = "+max.radius);
		sc.close();

	}

}
