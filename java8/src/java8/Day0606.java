package java8;

import java.util.Scanner;

public class Day0606 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		int i, j;
		for(i = 1; i < 10; i++)
		{
			for(j = dan; j <= dan; j++)
			{
				System.out.print(j + " x " + i + " = " + (i * j));
								
			}
			System.out.println();
			
		}
		System.out.println("==========");
		for(i = 1; i < 10; i++)
		{
			System.out.println(dan + " x " + i + " = " + (i * dan));
		}
		sc.close();
	}

}
