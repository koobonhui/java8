package java8;

import java.util.Scanner;

public class Day0612 {

	public static void main(String[] args) {
		System.out.println("��");
		System.out.println("���� q");
		
		Scanner sc = new Scanner(System.in);
		String iString;
		
		do
		{
			System.out.print("> ");
			iString = sc.nextLine();
			System.out.println(iString);
		}while(!iString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
		sc.close();
	}
}
