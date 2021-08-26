package Midterm;

import java.util.Random;

public class Q10 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		Random rand = new Random();
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				int num = rand.nextInt(10)+1;
				arr[i][j] = num;
				System.out.print(num+"\t");
			}
			System.out.println();
		}

	}

}
