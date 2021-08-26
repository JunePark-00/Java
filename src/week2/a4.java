package week2;

import java.util.Scanner;

public class a4 {

	public static void main(String[] args) {
		/* Write a program to get the amount of KRW and exchange it to USD. 
		 * The exchange rate is “1USD = 1100KRW”.
		 * Input KRW : 3300 
		 * 3300 KRW is 3.0 USD.
		 */

		System.out.print("Input KRW : ");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		double u_money = money / 1100;
		System.out.println(money+" KRW is "+u_money+" USD.");
		scan.close();

	}

}
