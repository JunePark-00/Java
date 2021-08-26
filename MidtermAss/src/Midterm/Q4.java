package Midterm;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// 간단한 369 게임 프로그램을 작성하라. 조건은 다음과 같다
		// 1. 1부터 99까지의 정수를 입력받아 10의 자리 수와 1의 자리 수를 검사한다.
		// 2. 3,6,9 숫자 하나 -> Clap
		// 3. 3,6,9 숫자 둘 -> Clap Clap
		// else, 프로그램 종료
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Integer(1~99) >> ");
		int num = scan.nextInt();
		int ten = num/10;
		int one = num%10;
		int cnt = 0;
		if(ten%3==0) {
			System.out.print("Clap ");
		} else {
			cnt++;
		}
		if(one%3==0 && one!=0) {
			System.out.print("Clap ");
		} else {
			cnt++;
		}
		
		if(cnt==2) {
			System.out.println("Exit");
		}
		scan.close();

	}

}
