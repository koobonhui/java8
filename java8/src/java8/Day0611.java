package java8;

import java.util.Scanner;

public class Day0611 {

	public static void main(String[] args) {
		int intvalue;
		int resvalue = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		intvalue = sc.nextInt();
		
		while(intvalue > 0)
		{
			resvalue = resvalue * 10;
			resvalue = resvalue + (intvalue % 10);
			intvalue /= 10;
		}
		System.out.println("�ٲ� ���� : " + resvalue);
		sc.close();
	}

}
