package java8;

public class Day0304 {
	public static void main(String[] args) {
		int n = 100; // 지역변수
		System.out.println(n);
		{
			int n2 = 200;
			System.out.println(n);
			System.out.println(n2); // 블럭변수
		}
		System.out.println(n);
//		System.out.println(n2);
	}

}
