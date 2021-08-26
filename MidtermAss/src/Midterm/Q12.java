package Midterm;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		String course[] = {"Java","C++","HTML","Kotlin","Python"};
		int score[] = {95,88,76,62,55};
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Subject >> ");
			String sub = scan.next();
			if(sub.equals("Quit")) {
				break;
			}
			int idx = -1;
			for(int i = 0; i < course.length; i++) {
				if(sub.equals(course[i])) {
					idx = i;
					break;
				}
			}
			if(idx==-1) {
				System.out.println("Invaild subject");
			} else {
				System.out.println("Score is "+score[idx]);
			}
			
		}
		scan.close();

	}

}
