package Midterm;

/*
 * class TV2{
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
 */

class IPTV extends ColorTV{
	private String addr;
	
	public IPTV(String addr, int size, int colors) {
		super(size, colors);
		this.addr = addr;
	}
	
	public void printProperty() {
		System.out.println("My IPTV is "+super.getSize()+" inches, "+super.getColors()+ " colors and IP address is "+addr);
	}
	
}

public class Q1D {

	public static void main(String[] args) {
		IPTV myTV = new IPTV("192.1.1.2",64,2047);
		// 192.1.1.2 is IP address
		myTV.printProperty();
	}

}
