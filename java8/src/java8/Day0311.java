package java8;

import java.util.Scanner;

public class Day0311 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Դϱ�?(���� : 1 �����ƴ� : 0) - ");
		int a = sc.nextInt();
		boolean x = a == 0 ? false : true;
		
		System.out.print("�α�(����: ��) - ");
		int b = sc.nextInt();
		
		System.out.print("������ ��(����: ��) - ");
		int c = sc.nextInt();
		
		
		boolean a1 = x && b >= 100;
		boolean a2 = c >= 50;
		boolean a3 = a1 || a2;
		System.out.println("��Ʈ�������� ���� : " + a3);
		sc.close();

	}

}
