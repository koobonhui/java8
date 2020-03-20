package java8;

import java.util.Scanner;

public class Day0612 {

	public static void main(String[] args) {
		System.out.println("입");
		System.out.println("종료 q");
		
		Scanner sc = new Scanner(System.in);
		String iString;
		
		do
		{
			System.out.print("> ");
			iString = sc.nextLine();
			System.out.println(iString);
		}while(!iString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		sc.close();
	}
}
