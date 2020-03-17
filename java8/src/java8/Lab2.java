package java8;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		int swap;
		
		System.out.print("두개의 정수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("교환 전 : a = " + a + " , " + "b = " + b);
		
		swap = a;
		a = b;		
		b = swap;
		
		System.out.println("교환 후 : a = " + a + " , " + "b = " + b);
		
		sc.close();
		

	}

}
