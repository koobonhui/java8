package java8;

import java.util.Scanner;

public class Day0202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number1, number2;
		
		System.out.print("�� ������ �Է��ϼ��� : ");
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		int sum;
		sum = number1 + number2;
		
		System.out.print("�� : ");
		System.out.println(sum);
		System.out.print("�� : ");
		System.out.println(number1+number2);
		sc.close();
	}	
	
}
