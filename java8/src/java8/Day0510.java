package java8;

import java.util.Scanner;

public class Day0510 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nan = (int)(Math.random() * 3);
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String com = "";
		String name = ""; 
		
		System.out.print("���� ���� �� ���� (a = ���� b = ���� c = ��) : ");
		name = sc.next();
		
		switch(name)
		{
			case "a" :
			case "A" :
				name = ga;
				break;
			case "b" :
			case "B" :
				name = ba;
			case "c" :
			case "C" :
				name = bo;
		}
		
		switch(nan)
		{
			case 0 :
				com = "����";
				break;
			case 1 :
				com = "����";
				break;
			case 2 :
				com = "��";
				break;
		}
		
		
		if((name == bo && com == ba) || (name == ga && com == bo) || (name == ba && com == ga))
		{
			System.out.println("��� ��! ��ǻ��: " + com + " ��� : " + name);
		}
		else if(name == com)
		{
			System.out.println("��� ��ǻ��: " + com + " ��� : " + name);
		}
		else
		{
			System.out.println("��ǻ�� ��! ��ǻ��: " + com + " ��� : " + name);
		}
	sc.close();	
		}
		
	

	}


