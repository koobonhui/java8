package java8;

import java.util.Scanner;

public class Day0503 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� �Է�(0 ~ 100) : ");
		int score = sc.nextInt();
		String pass = "";
		/*
		if (score >= 60)
		{
			//System.out.println("�հ�");
			pass = "��";
		}
		{
			
		}
		else
		{
			//System.out.println("���հ�");
			pass = "��";
		}
		*/
		if (score >= 90)
		{
			//System.out.println("�հ�");
			pass = "A";
		}
		else if(score < 90 && score >= 80)
		{
			pass = "B";
		}
		else if(score < 80 && score >= 70)
		{
			pass = "C";
		}
		else if(score < 70 && score >= 60)
		{
			pass = "D";
		}
		else if(score < 60)
		{
			//System.out.println("���հ�");
			pass = "F";
		}
		System.out.println(pass);
		System.out.println("���� ������ " + pass + " �Դϴ�.");
		sc.close();
		//90�̻� a 90�̸�80�̻� b 80�̸�70�̻� c 70�̸�60�̻� d 60�̸� f

	}

}
