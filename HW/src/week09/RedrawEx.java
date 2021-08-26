package week09;
/*

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
*/
public class RedrawEx {

	public static void main(String[] args) {
		Shape donut = new Circle(10); // Radius is 10
		donut.redraw();
		System.out.println("Area : " + donut.getArea());

	}

}
