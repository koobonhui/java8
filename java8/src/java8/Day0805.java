package java8;

import java.util.Scanner;

public class Day0805 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ������ �Է� �ϼ��� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int re1 = 0;   // �ּ�
		int re2 = 0;   // �ִ�
		for(int i = 1; i <= Integer.MAX_VALUE; i++)
		{
			if(i % a == 0 && i % b == 0)
			{
				re1 = i;
				break;
			}	
		}
		
		re2 = a * b / re1;
		
		System.out.println("�ּ� ����� : " + re1);
		System.out.println("�ִ� ����� : " + re2);
		sc.close();
		

	}

}
