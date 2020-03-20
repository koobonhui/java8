package java8;

import java.util.Scanner;

public class Day0610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("윤년을 판별한 년도 입력 : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.println(year + " 는 윤년임");
		}
		else
			System.out.println(year + " 는 윤년아님");
		sc.close();
	}

}
