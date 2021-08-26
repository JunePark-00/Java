package week10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("** REWARD Management System **");
		while(true) {
			System.out.print("Enter name & reward point >> ");
			String name = scan.next();
			if(name.equals("exit")) {
				break;
			}
			int point = scan.nextInt();
			
			boolean b = map.containsKey(name);
			if(b) {
				map.put(name, map.get(name)+point);
			} else {
				map.put(name, point);
			}
			
			Iterator<String> iter = map.keySet().iterator();
			while(iter.hasNext()) {
				String key = iter.next();
				int value = map.get(key);
				System.out.print("("+key+","+value+")");
			}
			System.out.println();
		}
		scan.close();

	}

}
