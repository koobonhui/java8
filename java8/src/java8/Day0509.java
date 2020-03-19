package java8;

import java.util.Scanner;

public class Day0509 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");
		String score = sc.nextLine();
		
		switch(score)
		{
			case "a" :
			case "A" :
				System.out.println("아메리카노");
				break;
			case "c" :
			case "C" :
				System.out.println("카푸치노");
				break;
			case "i" :
			case "I" :
				System.out.println("카페라떼");
				break;
			case "m" :
			case "M" :
				System.out.println("카페모카");
				break;
		}
		sc.close();
	}

}
