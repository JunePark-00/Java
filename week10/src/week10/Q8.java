package week10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Double> map = new HashMap<String, Double>();
		System.out.println("DK Scholarship management system.");
		for(int i = 0; i < 5; i++) {
			System.out.print("Name & grade >> ");
			String name = scan.next();
			double grade = scan.nextDouble();
			map.put(name, grade);
		}
		System.out.print("Input grade limitation >> ");
		double limit = scan.nextDouble();
		String text = "Scholarship students : ";
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			double value = map.get(key);
			if(value>=limit) {
				text += key+" ";
			}
		}
		
		System.out.println(text);
		scan.close();
	}

}
