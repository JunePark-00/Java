package Midterm;

import java.util.Scanner;

public class QD {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.print("Input 10 positive integers >> ");
		int num = 0;
		for(int i = 0; i < 10; i++) {
			num = scan.nextInt();
			arr[i] = num;
		}
		System.out.print("Multiples of 3: ");
		for(int i = 0; i < 10; i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
		}
		scan.close();

	}

}
