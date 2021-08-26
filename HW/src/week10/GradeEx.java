package week10;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>(6);
		System.out.print("Enter grades of 6 students (A/B/C/D/F)>> ");
		int i = 0;
		int cnt = 0;
		double total = 0.0;
		while(i<6) {
			String grade = scan.next();
			if(grade.equals("A")){
				total += 4.0;
			} else if(grade.equals("B")) {
				total += 3.0;
			} else if(grade.equals("C")) {
				total += 2.0;
			} else if(grade.equals("D")) {
				total += 1.0;
			} else if(grade.equals("F")) {
				total += 0.0;
			} else {
				grade = "Invalid";
			}
			a.add(grade);
			i++;
		}
		scan.close();
		for(i = 0; i < a.size(); i++) {
			if(a.get(i).equals("Invalid")) {
				System.out.println(a.get(i));
				cnt = 1;
			}
		}
		if(cnt==0) {
			double avg = total/6;
			System.out.println("Average : "+avg);
		}	
	}

}
