package week09;
import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Convert "+getSrcString()+" to "+getDestString());
		System.out.println("Enter "+getSrcString()+" >>> ");
		double val = scan.nextDouble();
		double res = convert(val);
		System.out.println(val+" "+getSrcString()+" is converted to "+res+" "+getDestString());
		scan.close();
	}
}

class Won2Dollar extends Converter{
	
	public Won2Dollar(double ratio) {
		super.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		double res = src/ratio;
		return res;
	}

	@Override
	protected String getSrcString() {
		String krw = "KRW";
		return krw;
	}

	@Override
	protected String getDestString() {
		String usd = "USD";
		return usd;
	}
}

public class Won2DollarEx {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200.0);
		toDollar.run();
	}

}

