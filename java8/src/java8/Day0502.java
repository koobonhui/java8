package java8;

import java.util.Scanner;

public class Day0502 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("���ڸ� �Է� : ");
		num = sc.nextInt();
		
		String re = "";
		if (num % 2 == 0)
		{
			re = "¦��";
			System.out.println("¦�� �Ǻ���");
		}
		else
		{
			re = "Ȧ��";
			System.out.println("Ȧ�� �Ǻ���");
		}
		
		System.out.println("���ڴ� " + num + " �̰��� " + re + " �Դϴ�.");
		
		sc.close();
			

	}

}
