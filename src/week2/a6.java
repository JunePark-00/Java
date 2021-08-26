package week2;

import java.util.Scanner;

public class a6 {

	public static void main(String[] args) {
		/* Program a very simple 369 game.
		 * Get integer between 1 and 99, Check the number on 10’s position & 1’s position. 
		 * If one of ‘3’, ‘6’ or ‘9’ is exist, print “Clap”
		 * If two of ‘3’, ‘6’ or ‘9’ are exist, print “Clap, Clap”
		 * Otherwise, finish the program.
		 * Input integer(1~99) :13 
		 * Clap
		 * Input integer(1~99) :39 
		 * Clap, Clap
		 */
		
		System.out.print("Input integer(1~99) :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int ten = num / 10;
		int one = num % 10;
		int count = 0;
		
		if(ten==3 || ten==6 || ten==9) {
			count++;
		}
		if(one==3 || one==6 || one==9) {
			count++;
		}
		
		if(count==1) {
			System.out.println("Clap");
		} else if(count==2) {
			System.out.println("Clap, Clap");
		}
		
		scan.close();
	}

}
