package java8;

import java.util.Scanner;

public class Day0610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Ǻ��� �⵵ �Է� : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.println(year + " �� ������");
		}
		else
			System.out.println(year + " �� ����ƴ�");
		sc.close();
	}

}
