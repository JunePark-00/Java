package Midterm;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input (x,y) >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(100<=x && x<=200 && 100<=y && y<=200) {
			System.out.println("Point("+ x + ", "+ y+") is in the rectangle.");
		} else {
			System.out.println("Point("+ x + ", "+ y+") is not in the rectangle.");
		}
		scan.close();
	}

}
