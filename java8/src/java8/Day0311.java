package java8;

import java.util.Scanner;

public class Day0311 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수도 입니까?(수도 : 1 수도아님 : 0) - ");
		int a = sc.nextInt();
		//boolean x = a == 0 ? false : true;
		
		System.out.print("인구(단위: 만) - ");
		int b = sc.nextInt();
		
		System.out.print("부자의 수(단위: 만) - ");
		int c = sc.nextInt();
		
		
		boolean a1 = a == 1 && b >= 100;
		boolean a2 = c >= 50;
		boolean a3 = a1 || a2;
		System.out.println("메트로폴리스 여부 : " + a3);
		sc.close();

	}

}
