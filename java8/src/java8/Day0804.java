package java8;

import java.util.Scanner;

public class Day0804 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("두 정수를 입력 하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int sum = 0;
		
		if(a > b)
		{
			for(int i = a; i >= b; i--)
			{
				sum = sum + i;
			}
			System.out.println(sum);
		}
		else if(a < b)
		{
			for(int i = a; i <= b; i++)
			{
				sum = sum + i;
			}
			System.out.println(sum);
		}
		else
		{
			System.out.println(a);
			System.exit(0);
		}
		
		
		

	}

}
