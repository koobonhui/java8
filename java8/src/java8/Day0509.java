package java8;

import java.util.Scanner;

public class Day0509 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		String score = sc.nextLine();
		
		switch(score)
		{
			case "a" :
			case "A" :
				System.out.println("�Ƹ޸�ī��");
				break;
			case "c" :
			case "C" :
				System.out.println("īǪġ��");
				break;
			case "i" :
			case "I" :
				System.out.println("ī���");
				break;
			case "m" :
			case "M" :
				System.out.println("ī���ī");
				break;
		}
		sc.close();
	}

}
