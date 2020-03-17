package java8;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		String total;
		
		System.out.print("두개의 정수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//String x = "a = " + a;
		//String y = "b = " + b;
		
		//total = (a > b) ?  x : y; 
		total = (a > b) ? "a = " + a : "b = " + b;
		
		System.out.println("입력 : a = " + a + " , " + "b = " + b);
		System.out.println("결과 : " + total);
		
		sc.close();
		

	}

}
