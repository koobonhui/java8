package java8;

import java.util.Scanner;

public class Day0508 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �Է� : ");
		String score = sc.nextLine();
		
		switch(score) //��Ʈ���� ���� ����
		{
			case "s" :
			case "S" :
				System.out.println("vip");
				break;
			case "a" :
			case "A" :
				System.out.println("���");
				break;
			case "b" :
			case "B" :
				System.out.println("���");
				break;
			default :
				System.out.println("�Ϲݰ�");
		}
		sc.close();
	}

}
