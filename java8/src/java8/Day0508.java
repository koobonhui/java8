package java8;

import java.util.Scanner;

public class Day0508 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등급 입력 : ");
		String score = sc.nextLine();
		
		switch(score) //스트링도 쓸수 있음
		{
			case "s" :
			case "S" :
				System.out.println("vip");
				break;
			case "a" :
			case "A" :
				System.out.println("우대");
				break;
			case "b" :
			case "B" :
				System.out.println("우수");
				break;
			default :
				System.out.println("일반고객");
		}
		sc.close();
	}

}
