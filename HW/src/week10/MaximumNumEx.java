package week10;

import java.util.Scanner;
import java.util.Vector;

public class MaximumNumEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.print("Enter integer (-1 to quit)>> ");
		int max_num = -1;
		while(true) {
			int num = scan.nextInt();
			if(num==-1) {
				break;
			}
			v.add(num);
			for(int i = 0; i < v.size(); i++) {
				if(max_num < v.get(i)) {
					max_num = v.get(i);
				}
			}
		}
		System.out.println("Maximum number is "+max_num);
		scan.close();

	}

}
