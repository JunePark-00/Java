package Midterm;

import java.util.Scanner;

public class QB {

	public static void main(String[] args) {
		System.out.print("Input integer >> ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i = 0; i < 5; i++) {
			for(int j = num; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
			num--;
		}
		
		scan.close();
	}

}
