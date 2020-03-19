package java8;

import java.util.Scanner;

public class Day0502 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("숫자를 입력 : ");
		num = sc.nextInt();
		
		String re = "";
		if (num % 2 == 0)
		{
			re = "짝수";
			System.out.println("짝수 판별중");
		}
		else
		{
			re = "홀수";
			System.out.println("홀수 판별중");
		}
		
		System.out.println("숫자는 " + num + " 이것은 " + re + " 입니다.");
		
		sc.close();
			

	}

}
