package java8;

import java.util.Random;

public class Day0507 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int now = rd.nextInt(4) + 9;
		
		System.out.println("�ð��� " + now);
		System.out.println("�����ϰ�");
		
		switch(now)
		{
			case 9 :
				System.out.println("9���");
			case 10 :
				System.out.println("10ȸ��");
			case 11 :
				System.out.println("11����");
			case 12 :
				System.out.println("12����");
		}
		
	}

}
