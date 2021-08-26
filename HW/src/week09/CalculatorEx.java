package week09;

import java.util.Scanner;

abstract class Calc{
	int a;
	int b;
	abstract void setValue(int a, int b);
	abstract int calculate();
}

class Add extends Calc{
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a+b;
	}
}

class Sub extends Calc{
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a-b;
	}
}

class Mul extends Calc{
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a*b;
	}
}

class Div extends Calc{
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		if(b==0) {
			System.out.println("It can't divide to 0");
			return 0;
		} else {
			return a/b;
		}
	}
}

public class CalculatorEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 operands & operator >>> ");
		String op = scan.nextLine();
		String[] temp = op.split(" ");
		int a = Integer.parseInt(temp[0]);
		int b = Integer.parseInt(temp[2]);
		
		switch(temp[1]) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
			
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
			
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
			
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
			
		}
		scan.close();
	}

}
