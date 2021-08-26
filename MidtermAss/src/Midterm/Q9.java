package Midterm;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		System.out.println("Input month(1~12) >> ");
		Scanner scan = new Scanner(System.in);
		int season = scan.nextInt();
		if(3 <= season && season <= 5) {
			System.out.println("Spring");
		} else if(6 <= season && season <= 8) {
			System.out.println("Summer");
		} else if(9 <= season && season <= 11) {
			System.out.println("Autumn");
		} else if(season==12 || season==1 || season==2) {
			System.out.println("Winter");
		} else {
			System.out.println("Invalid");
		}
		scan.close();

	}

}
