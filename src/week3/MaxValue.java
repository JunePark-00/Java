package week3;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		/* 
		 * Q1)
		 * Input 5 arbitrary integer (> 0) and save it to array. 
		 * Print out all input values and the maximum. 
		 */
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int i = 0;
		System.out.println("Input arbitrary integer (> 0)");
		while(i<5) {
			int num = scan.nextInt();
			if(num<=0) {
				System.out.println(num+" is invaild");
				continue;
			}
			arr[i] = num;
			if(max < num) {
				max = num;
			}
			i++;
		}
		for(int k : arr) {
			System.out.print(k+" ");
		}
		System.out.println("--> Maximum value is "+max);
		scan.close();
	}

}
