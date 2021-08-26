package Midterm;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input center and radius of 1st circle >> ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int r1 = scan.nextInt();
		System.out.println("Input center and radius of 2nd circle >> ");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int r2 = scan.nextInt();
		int dis = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
		if(dis < ((r1+r2)*(r1+r2))) {
			System.out.println("Two circles are overlapped");
		} else {
			System.out.println("Two circles are not overlapped");
		}
		scan.close();
		
	}

}
