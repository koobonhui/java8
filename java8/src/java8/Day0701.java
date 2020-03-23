package java8;

import java.util.Scanner;

public class Day0701 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == b)
		{
			System.out.println("Same");
		}
		else
			System.out.println("Different");
		
		String re = a == b ? "같음" : "다름";
		System.out.println(re);
		sc.close();
	}

}
