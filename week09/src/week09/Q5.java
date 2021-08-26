package week09;

interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("-- Redraw : ");
		draw();
	}
}

class Circle implements Shape{
	double r;
	
	Circle(double r){
		this.r = r;
	}
	@Override
	public void draw() {
		System.out.println("Circle with radius "+r);
		
	}

	@Override
	public double getArea() {
		return PI*r*r;
	}
	
}

class Rect implements Shape{
	double a,b;
	
	Rect(double a, double b){
		this.a = a;
		this.b = b;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle with size "+a+"x"+b);
		
	}

	@Override
	public double getArea() {
		return a*b;
	}
	
}

public class Q5 {

	public static void main(String[] args) {
		Shape[] list = new Shape[2];
		list[0] = new Circle(10);
		list[1] = new Rect(10,40);
		
		for(int i=0;i<list.length;i++) list[i].redraw();
		for(int i=0;i<list.length;i++) 
			System.out.println("Area : "+list[i].getArea());

	}

}
