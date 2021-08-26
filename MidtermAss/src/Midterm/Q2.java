package Midterm;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// Scanner 클래스를 이용하여 2자리의 정수(10~99 사이)를 입력받고,
		// 10의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라
		Scanner scan = new Scanner(System.in);
		System.out.print("Input 2-digit integer(10-99) >> ");
		int num = scan.nextInt();
		int ten = num/10;
		int one = num%10;
		if(ten == one) {
			System.out.println("Yes! The digits of 10 and the digits of 1 are the same.");
		} else {
			System.out.println("No! The digits of 10 and the digits of 1 are different.");
		}
		scan.close();
	}

}
