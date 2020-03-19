package java8;

import java.util.Scanner;

public class Day0501 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("숫자를 입력 : ");
		num = sc.nextInt();
		/*
		String re = num % 2 == 0 ? "짝" : "홀";
		
		System.out.println("숫자는 " + num + " 이것은 " + re + " 입니다.");
		*/
		String re = "";
		if (num % 2 == 0)
		{
			re = "짝수";
			System.out.println("짝수 판별중");
		}
		if (num % 2 != 0)
		{
			re = "홀수";
			System.out.println("홀수 판별중");
		}
		
		System.out.println("숫자는 " + num + " 이것은 " + re + " 입니다.");
		
		sc.close();
			

	}

}
