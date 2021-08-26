package Midterm;

import java.util.Random;

public class QE {

	public static void main(String[] args) {
		Random rand = new Random();
		int arr[] = new int[10];
		int sum = 0;
		System.out.print("Random numbers : ");
		for(int i = 0; i < 10; i++) {
			int randNum = rand.nextInt(10)+1;
			arr[i] = randNum;
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		int average = sum/10;
		System.out.println();
		System.out.println("Average: "+average);

	}

}
