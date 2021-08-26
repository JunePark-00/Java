package week10;

import java.util.Scanner;
import java.util.Vector;

public class Q4 {

	public static void main(String[] args) {
		/*
		 * a. Get current amount of rainfall and save in Vector collection
		 * b. Print all input amounts of rainfall and average.
		 * c. if User input 0, quit.
		 */
		
		Vector<Integer> v = new Vector<Integer>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int total = 0;
			System.out.print("Enter amount of rainfall (0 to quit)>> ");
			int num = scan.nextInt();
			if(num==0) {
				break;
			}
			v.add(num);
			for(int i = 0; i < v.size(); i++) {
				System.out.print(v.get(i)+" ");
				total += v.get(i);
			} 
			System.out.println();
			System.out.println("Current Average : "+total/v.size());
			
		}
		
		scan.close();

	}

}
