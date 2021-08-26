package Midterm;

class TV2{
	private int size;
	public TV2(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV2{
	private int colors;
	public ColorTV(int size,int colors) {
		super(size);
		this.colors = colors;
	}
	
	public void printProperty() {
		System.out.println(super.getSize()+" inches, "+colors+ "colors");
	}
	
	protected int getColors() {
		return colors;
	}
	
}

public class Q1C {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(64,1024);
		myTV.printProperty();

	}

}
