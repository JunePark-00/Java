package week3;

public class Multiplication {

	public static void main(String[] args) {
		/*
		 * Q4) Write a program to print out the multiplication table as following: 
		 * 2*1=2 3*1=3 ... 
		 * . 
		 * . 
		 * . 
		 * 2*9=18 ...
		 */
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				int result = i * j;
				System.out.print(j + "*" + i + "=" + result+" 	");
			}
			System.out.println();
		}
	}

}
