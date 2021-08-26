package Midterm;

import java.util.Random;
import java.util.Scanner;

public class QF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Number of elements : ");
		int num = scan.nextInt();
		int arr[] = new int[num];
		int i = 0;
		// 중복 금지
		while(i < arr.length) {
			int cnt = 0;
			int randNum = rand.nextInt(100)+1;
			arr[i] = randNum;
			int j = 0;
			while(j<i) {
				if(arr[j]==arr[i]) {
					cnt = 1;
					break;
				}
				j++;
			}
			if(cnt==1) {
				continue;
			}
			i++;
		}
		i = 0;
		while(i < arr.length) {
			System.out.print(arr[i]+" ");
			if((i+1)%10==0) {
				System.out.println();
			}
			i++;
		}
		scan.close();
	}

}
