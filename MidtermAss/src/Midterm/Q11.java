package Midterm;

import java.util.Random;

public class Q11 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		Random rand = new Random();
		int i = 0;
		while(true) {
			int cnt = 0;
			int x = rand.nextInt(4);
			int y = rand.nextInt(4);
			arr[y][x] = 1;
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(arr[j][k]==1) {
						cnt++;
					}
				}
			}
			if(cnt==10) {
				break;
			} else {
				i++;
			}
		}
		int num = 0;
		i = 0;
		for(i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(arr[i][j]==1) {
					num = rand.nextInt(10)+1;
					arr[i][j] = num;
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}


	}

}
