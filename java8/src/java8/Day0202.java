package java8;

import java.util.Scanner;

public class Day0202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number1, number2;
		
		System.out.print("두 정수를 입력하세요 : ");
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		int sum;
		sum = number1 + number2;
		
		System.out.print("합 : ");
		System.out.println(sum);
		System.out.print("합 : ");
		System.out.println(number1+number2);
		sc.close();
	}	
	
}
