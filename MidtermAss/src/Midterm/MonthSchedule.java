package Midterm;

import java.util.Scanner;

class Day {
	private String todo;

	public void set(String todo) {
		this.todo = todo;
	}

	public String get() {
		return todo;
	}

	public void show() {
		if (todo == null) {
			System.out.println("Nothing to do");
		} else {
			System.out.println(todo);
		}
	}
}

public class MonthSchedule {

	public static void main(String[] args) {
		Day d[] = new Day[30];
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Monthly schedule management system");
			System.out.println("Todo (Input:1, Show:2, Quit:3) >> ");
			String sel = scan.next();
			if (sel.equals("3")) {
				System.out.println("Quit program.");
				break;
			} else {
				System.out.println("Date(1-30)");
				int date = scan.nextInt();
				int idx = date - 1;
				if (sel.equals("1")) {
					System.out.println("Todo(Enter string without space) ? ");
					String todo = scan.next();
					d[idx] = new Day();
					d[idx].set(todo);
				} else if (sel.equals("2")) {
					d[idx].show();
				}
			}
		}
		scan.close();

	}

}
