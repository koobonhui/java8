package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0802 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num1 = (int)(Math.random() * 8) + 2;
		int num2 = rd.nextInt(9) + 1;
		
		int quiz = num1 * num2;
		
		System.out.print(num1 + " x " + num2 + " = ");
		int ans = sc.nextInt();
		
		if(quiz == ans)
		{
			System.out.println("정답입니다.");
		}
		else
		{
			System.out.println("틀렸습니다.");
		}
		sc.close();
	}

}
