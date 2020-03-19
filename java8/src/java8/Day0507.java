package java8;

import java.util.Random;

public class Day0507 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int now = rd.nextInt(4) + 9;
		
		System.out.println("시간은 " + now);
		System.out.println("남은일과");
		
		switch(now)
		{
			case 9 :
				System.out.println("9출근");
			case 10 :
				System.out.println("10회의");
			case 11 :
				System.out.println("11업무");
			case 12 :
				System.out.println("12점심");
		}
		
	}

}
