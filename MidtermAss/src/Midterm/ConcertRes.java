package Midterm;

import java.util.Scanner;

public class ConcertRes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("DK Concert hall reservation system");
		String C[][] = new String[3][10];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 10; j++) {
				C[i][j] = "-"+(j+1)+"-";
			}
		}
		while(true) {
			System.out.println("1 : Reservation");
			System.out.println("2 : Status");
			System.out.println("3 : Cancel");
			System.out.println("4 : Quit");
			System.out.print(">>> ");
			
			int sel = scan.nextInt();
			String type = "";
			
			if(sel==1) {
				System.out.print("Class S(1), A(2), B(3) >> ");
				int seatClass = scan.nextInt()-1;
				for(int i = 0; i < 10; i++) {
					System.out.print(C[seatClass][i]+" ");
				}
				System.out.println();
				System.out.print("Name >> ");
				String name = scan.next();
				System.out.print("Sheet number >> ");
				int num = scan.nextInt();
				C[seatClass][num-1] = name;
				if(seatClass==0) {
					type = "S";
				} else if(seatClass==1) {
					type = "A";
				} else {
					type = "B";
				}
				System.out.println(type+" class sheet #"+num+" reserved for "+name);
			} else if(sel==2) {
				for(int i = 0; i < 3; i++) {
					if(i==0) {
						type = "S";
					} else if(i==1) {
						type = "A";
					} else {
						type = "B";
					}
					System.out.print("Class "+type+" >> ");
					for(int j = 0; j < 10; j++) {
						System.out.print(C[i][j]+" ");
					}
					System.out.println();
				}
			} else if(sel==3) {
				System.out.print("Name >> ");
				String name = scan.next();
				int cnt = 0;
				for(int i = 0; i < 3; i++) {
					if(i==0) {
						type = "S";
					} else if(i==1) {
						type = "A";
					} else {
						type = "B";
					}
					for(int j = 0; j < 10; j++) {
						if(C[i][j].equals(name)) {
							C[i][j] = "-"+(j+1)+"-";
							cnt = 1;
							System.out.println("Reservation for "+name+", Class "+type+" #"+(j+1)+" cancelled.");
							break;
						}
					}
					if(cnt==1) {
						break;
					}
				}
				if(cnt==0) {
					System.out.println("Not Found");
				}
			} else if(sel==4) {
				break;
			}
		}
		scan.close();

	}

}
