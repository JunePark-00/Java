package Midterm;

import java.util.Scanner;

class Phone {
	public String name;
	public String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public void show() {
		System.out.println(name + " / " + tel);
	}
}

public class PhoneBook {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of persons : ");
		int num = scan.nextInt();
		String name = "";
		Phone p[] = new Phone[num];
		for (int i = 0; i < num; i++) {
			System.out.print("Input name & phone number >> ");
			name = scan.next();
			if (name.equals("quit")) {
				break;
			}
			String tel = scan.next();
			p[i] = new Phone(name, tel);
		}

		while (true) {
			int cnt = 0;
			System.out.println("Search >> ");
			name = scan.next();
			if (name.equals("quit")) {
				break;
			}
			for (int i = 0; i < num; i++) {
				if (p[i].name.equals(name)) {
					p[i].show();
					cnt = 1;
					break;
				}
			}
			if (cnt == 0) {
				System.out.println("Not found");
			}
		}

		scan.close();

	}

}
