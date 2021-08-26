package Midterm;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y) {
		super(x,y);
	}
	
	ColorPoint() {
		super(0,0);
		this.color = "BLACK";
	}
	

	public void setXY(int x, int y) {
		super.move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color+" color on ("+super.getX()+","+super.getY()+")";
	}
	
}

public class Q1F {

	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // set BLACK on (0, 0)
		System.out.println(zeroPoint.toString());
		
		ColorPoint cp = new ColorPoint(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString());
		
		// BLACK color on (0, 0)
		// RED color on (5, 5)
	}

}
