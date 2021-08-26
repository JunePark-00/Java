package week3;

public class NonSqArr {

	public static void main(String[] args) {
		/*
		 * Q3)
		 * Create an array as following & print out all elements.
		 * Result should be as following:
		 * 10 11 12
		 * 20 21
		 * 30 31 32
		 * 40 41
		 * Initialize values by using "for" statements only!!!
		 */
		int arr[][] = new int[4][];
		for(int i = 0; i < 4; i++) {
			int num = 10*(i+1);
			if(i%2!=0) {
				arr[i] = new int[2];
			} else {
				arr[i] = new int[3];
			}
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num + j;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
