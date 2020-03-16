package java8;

import java.util.Random;

public class Day0305 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 3;
		
		int re = n1 + n2;
		int re2 = n1 - n2;
		int re3 = n1 * n2;
		int re4 = n1 / n2;
		int re5 = n1 % n2;
		double re6 = n1 / n2; // 정수연산은 정수 출력
		double re7 = (double)n1 / n2;  // n1이 강제변환 하면서 n2도 자동변환
		
		System.out.println(re);
		System.out.println(re2);
		System.out.println(re3);
		System.out.println(re4);
		System.out.println(re5);
		System.out.println(re6);
		System.out.println(re7);
		
		int re8 = n1 % 2;
		
		System.out.println(re8);
		
		Random rd = new Random();
		
		int n3 = rd.nextInt();
		System.out.println(n3);
		
		int re9 = Math.abs(n3) % 45 + 1;
		System.out.println(re9);
	}

}
