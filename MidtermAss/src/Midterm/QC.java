package Midterm;

import java.util.Scanner;

public class QC {

	public static void main(String[] args) {
		System.out.print("Input a lowercase alphabet >> ");
		Scanner scan = new Scanner(System.in);
		char alpha = scan.next().charAt(0);
		int temp = (int)alpha;
		for(int i = 0; i < 5; i++) {
			for(int j = (int)alpha-4; j <= temp; j++) {
				char al = (char)j;
				System.out.print(al);
			}
			System.out.println();
			temp--;
		}
		scan.close();

	}

}
