package java8;

import java.util.Scanner;

public class Day0801 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자입력 : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println();
		sc.close();

	}

}
