package week4;

public class Circle3 {
	public double radius;
	
	public Circle3(double val) {
		radius = val;
	}
	
	public double getArea() {
		double area = 3.14*radius*radius;
		return area;
	}

	public static void main(String[] args) {
		Circle3 c1 = new Circle3(5.0);
		Circle3 c2 = new Circle3(6.0);
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
	}

}
