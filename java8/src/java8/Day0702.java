package java8;

import java.util.Scanner;

public class Day0702 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¼ıÀÚ ÀÔ·Â : ");
		int a = sc.nextInt();
		
		if(a % 2 == 0)
		{
			System.out.println("Â¦");
		}
		else
			System.out.println("È¦");
		
		sc.close();

	}

}
