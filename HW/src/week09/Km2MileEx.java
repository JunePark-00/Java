package week09;

/* import java.util.Scanner;
 * abstract class Converter{
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
 */

class Km2Mile extends Converter{
	public Km2Mile(double ratio) {
		super.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		double res = src/ratio;
		return res;
	}

	@Override
	protected String getSrcString() {
		return "km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}
}

public class Km2MileEx {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();

	}

}

