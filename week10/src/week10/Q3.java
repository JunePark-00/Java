package week10;

import java.util.HashMap;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/*
		 * Write a program a. Use Scanner class to get “Nation” & “Population” and save
		 * it in HashMap. b. If user input “stop” for “Nation”, stop to get and display
		 * “Search population of “ c. Use Scanner class to get “Nation” d. Search nation
		 * and print the result. e. If the input nation is not found, print error
		 * message f. If user enter “exit”, quit.
		 */
		Scanner scan = new Scanner(System.in);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("Enter nation & population (Ex: Korea 5000)");
		while (true) {
			System.out.print("Nation & population >> ");
			String n = scan.next();
			if (n.equals("stop")) {
				break;
			}
			int p = scan.nextInt();
			map.put(n, p);
		}
		while (true) {
			System.out.print("Search population of ");
			String n = scan.next();
			if (n.equals("exit")) {
				break;
			}

			boolean b = map.containsKey(n);
			if (b) {
				System.out.println("Population if " + n + " is " + map.get(n));
			} else {
				System.out.println("Cannot find " + n);
			}
		}

		scan.close();
	}

}
