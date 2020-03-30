package Day12;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		int re1 = cal.plus(10, 20);
		System.out.println(re1);
		
		byte n1 = 10;
		byte n2 = 3;
		
		double re2 = cal.divide(n1, n2);
		System.out.println(re2);
		
		long n3 = 100;
		long n4 = 30;
		
		double re3 = cal.plus(n3, n4);
		System.out.println(re3);
		
		cal.powerOff();

	}

}
