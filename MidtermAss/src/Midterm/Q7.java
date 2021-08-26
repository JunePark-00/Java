package Midterm;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		System.out.print("Input senter point & radius >> ");
		Scanner scan = new Scanner(System.in);
		float cx = scan.nextFloat();
		float cy = scan.nextFloat();
		float r = scan.nextFloat();
		System.out.print("Input point >> ");
		float x = scan.nextFloat();
		float y = scan.nextFloat();
		
		float dis = (x-cx)*(x-cx) + (y-cy)*(y-cy);
		if(dis <= r*r) {
			System.out.println("Point("+x+", "+y+") is in the circle.");
		} else {
			System.out.println("Point("+x+", "+y+") is not in the circle.");
		}
		
		scan.close();

	}

}
