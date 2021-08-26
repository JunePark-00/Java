package Midterm;

public class TV {

	public String company;
	public int y;
	public int s;
	
	void show() {
		System.out.println("My TV is " + s + " inches manufactured by " + company + " in " + y);
	}

	public TV(String com, int year, int size) {
		company = com;
		y = year;
		s = size;
	}

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2021, 85);
		myTV.show();
	}

}
