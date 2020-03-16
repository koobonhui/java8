package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		
		int ran = 0;
		Random rd = new Random();
		ran = rd.nextInt(51) + 50;
//		ran = (int)(Math.random() * 51) + 50;
		
		System.out.print(name + "님의 오늘의 행운은 ");
		String str = "% 입니다.";
		System.out.println(ran + str);
		sc.close();
		
	
	}

}
