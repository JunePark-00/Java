package Midterm;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// Scanner class를 이용하여 정수3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[3]; 
		System.out.print("Input 3 integers >> ");
		for(int i = 0; i < 3; i++) {
			arr[i] = scan.nextInt();
		}
		int temp = 0;
		for(int i = 0; i < 2; i++) {
			if(arr[i] > arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Middle number is "+arr[1]);
		scan.close();
	}

}
