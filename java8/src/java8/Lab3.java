package java8;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		String total;
		
		System.out.print("�ΰ��� ���� �Է� : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//String x = "a = " + a;
		//String y = "b = " + b;
		
		//total = (a > b) ?  x : y; 
		total = (a > b) ? "a = " + a : "b = " + b;
		
		System.out.println("�Է� : a = " + a + " , " + "b = " + b);
		System.out.println("��� : " + total);
		
		sc.close();
		

	}

}
