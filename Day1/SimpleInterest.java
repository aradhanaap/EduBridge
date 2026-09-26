package day1;

public class SimpleInterest {

	public static void main(String[] args) {
		int p=10000;
		int t=3;
		double r=7.5;
		double SI=(p*t*r)/100;
		double TA=(p+SI);
		System.out.println("Simple Interest =" + SI);
		System.out.println("Total Amount =" + TA);
		

	}

}
