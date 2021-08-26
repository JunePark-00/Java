package Midterm;

import java.util.Scanner;

public class Grade {
	public int Math;
	public int Science;
	public int English;
	
	public Grade(int math, int science, int english){
		Math = math;
		Science = science;
		English = english;
	}
	int average() {
		int average = (Math+Science+English)/3;
		return average;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input scores in order of Math., Science and English >> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("Average : "+me.average());
		scanner.close();
	}

}
