package java8;

import java.util.Scanner;

public class Day0713 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력(홀수만) : ");
		int a = sc.nextInt();
		
		if(a % 2 != 0)
		{
			for(int i = 0; i < a; i++)
			{
				for(int j = 0; j <= i; j++)
				{
					System.out.print("$");
				}
					System.out.println();
			}
			
			for(int x = a - 1; x > 0; x--)
			{
				for(int k = 0; k < x; k++)
				{
					System.out.print("$");
				}
				System.out.println();
			}
			
		}
		else
			System.out.println("홀수만 입력");
		
//		int upline = a / 2;
//		int downline = a - upline;
//		
//		if(a % 2 == 0)
//		{
//			System.out.println("종료");
//			System.exit(0);
//		}
//		for(int i = 0; i < upline; i++)
//		{
//			for(int j = 0; j <= i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = downline; i > 0; i--)
//		{
//			for(int j = 0; j < i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		sc.close();
	}

}
