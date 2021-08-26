package week2;

import java.util.Scanner;

public class a5 {

	public static void main(String[] args) {
		/* Get an integer number between 10 and 99 by using Scanner class. 
		 * Check whether the 10’s position and 1’s position is same or not.
		 * Input integer(10~99) :77 
		 * Yes! 7 & 7 are same.
		 * Input integer(10~99) :43 
		 * No! 4 & 3 are not same.
		 */
		System.out.print("Input integer(10~99) : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int ten = num / 10;
		int one = num % 10;
		if(ten == one) {
			System.out.println("Yes!"+ten+" & "+one+" are same.");
		} else {
			System.out.println("No!"+ten+" & "+one+" are not same.");
		}
		scan.close();
	}

}
