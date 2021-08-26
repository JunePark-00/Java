package Midterm;

public class Rectangle {
	
	public int x;
	public int y;
	public int width;
	public int height;
	
	Rectangle(){}
	public Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		int area = width * height;
		return area;
	}
	
	void show() {
		System.out.println("Rectangle at ("+x+","+y+") with area "+square());
	}
	
	boolean contains(Rectangle r) {
		return (x <= r.x && r.x+r.width <= x+width && r.y <= y && y-height <= r.y-r.height);
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("Area : "+s.square());
		if(t.contains(r)) System.out.println("t includes r");
		if(t.contains(s)) System.out.println("t includes s");
	}

}
