package week3;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		/* 
		 * Q2)
		 * Input 5 arbitrary integer (> 0) and save it to array. 
		 * Print out all input values and the value. 
		 */
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int i = 0;
		System.out.println("Input arbitrary integer (> 0)");
		while(i<5) {
			int num = scan.nextInt();
			if(num<=0) {
				System.out.println(num+" is invaild");
				continue;
			}
			arr[i] = num;
			i++;
		}
		for(int k : arr) {
			System.out.print(k+" ");
			total += k;
		}
		int avg = total/5;
		System.out.println("--> Average is "+avg);
		scan.close();
	}

}
