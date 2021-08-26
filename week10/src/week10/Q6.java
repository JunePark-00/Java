package week10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student2{
	HashMap<String, Student2> map;
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private String department;
	private String id;
	private double grade;
	
	public Student2(String name, String department, String id, double grade) {
		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
		map = new HashMap<String, Student2>();
	}
	
	private void read() {
		System.out.println("Enter student name, major, id, and average of grade.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = scan.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String id = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student2 h = new Student2(name,department,id,grade);
			map.put(name, h);
			
		}
	}
	
	void printAll() {
		Iterator<String> iter = map.keySet().iterator(); 
		while(iter.hasNext()) {
			System.out.println("---------------------------");
			String key = iter.next();
			Student2 value = map.get(key);
			System.out.println("Name : "+value.name);
			System.out.println("Major : "+value.department);
			System.out.println("ID : "+value.id);
			System.out.println("Avg. Grade : "+value.grade);
			System.out.println("---------------------------");
		}	
	}
	
	void processQuery() {
		while(true) {
			System.out.print("Student name >> ");
			String n = scan.next();
			if(n.equals("exit")){
				break;
			}
			boolean b = map.containsKey(n);
			if(b) {
				System.out.println(map.get(n).name+", "+map.get(n).department+", "+map.get(n).id+", "+map.get(n).grade);
			}
		}
	}
	
	void run() {
		read();
		printAll();
		processQuery();
	}
	
}

public class Q6 {

	public static void main(String[] args) {
		// Rewrite Q5 by using HashMap<String, Student>. The key is the name of the student.
		Student2 st = new Student2(null,null,null,0);
		st.run();
	}

}
