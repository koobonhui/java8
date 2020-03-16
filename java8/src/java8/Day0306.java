package java8;

public class Day0306 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 20;
		
		System.out.println("a < b : " + (a < b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a > b : " + (a > b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
		
		System.out.println("======================");
		
		System.out.println("c < b : " + (c < b));
		System.out.println("c <= b : " + (c <= b));
		System.out.println("c > b : " + (c > b));
		System.out.println("c >= b : " + (c >= b));
		System.out.println("c == b : " + (c == b));
		System.out.println("c != b : " + (c != b));
		
		boolean re = a < b;
		
		System.out.println("a < b : " + re);
		
		

	}

}
