package Midterm;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 표시하는 프로그램을 작성하시오
		// 1 USD = 1100KRW
		// Input KRW >> 3300
		// 3300 KRW is 3.0 USD
		Scanner scan = new Scanner(System.in);
		System.out.print("Input KRW >> ");
		int kmoney = scan.nextInt();
		float umoney = kmoney/1100;
		System.out.println(kmoney+" KRW is "+umoney+" USD");
		scan.close();
	}

}
