package week10;
/*
 * a. Create a Student object for 4 students
 * b. Save information to ArrayList<Student> (Get information by using Scanner class)
 * c. Print all 4 students' information. Make printAll() method.
 * d. Get name of student, search and print information. Make processQuery() method.
 * e. If user input “exit”, quit. In processQuery() method.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student{
	ArrayList<Student> s;
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private String department;
	private String id;
	private double grade;
	
	public Student(String name, String department, String id, double grade) {
		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
		s = new ArrayList<Student>();
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
			
			Student h = new Student(name,department,id,grade);
			s.add(h);
			
		}
	}
	
	void printAll() {
		for(int i = 0; i < 4; i++) {
			System.out.println("---------------------------");
			System.out.println("Name : "+s.get(i).name);
			System.out.println("Major : "+s.get(i).department);
			System.out.println("ID : "+s.get(i).id);
			System.out.println("Avg. Grade : "+s.get(i).grade);
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
			for(int i = 0; i < 4; i++) {
				if(s.get(i).name.equals(n)) {
					System.out.println(s.get(i).name+", "+s.get(i).department+", "+s.get(i).id+", "+s.get(i).grade);
					break;
				}
			}
		}
	}
	
	void run() {
		read();
		printAll();
		processQuery();
	}
	
}

public class Q5 {

	public static void main(String[] args) {
		Student st = new Student(null, null, null, 0);
		st.run();		
	}

}
