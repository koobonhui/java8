package java8;

import java.util.Scanner;

public class Day0609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String com = "";
		String name = "";
		int score = 0;
		int life = 3;
		
		while (true) 
		{
			int nan = (int) (Math.random() * 3);
			System.out.print("���� ���� �� ���� (a = ���� b = ���� c = �� q = ����) : ");
			name = sc.next();

			switch (name) 
			{
			case "a":
			case "A":
				name = ga;
				break;
			case "b":
			case "B":
				name = ba;
				break;
			case "c":
			case "C":
				name = bo;
				break;
			case "q":
			case "Q":
				name = "quit";
				break;
			}
			if(name == "quit")
			{
				System.out.println("����");
				break;
			}	

			switch (nan) {
			case 0:
				com = "����";
				break;
			case 1:
				com = "����";
				break;
			case 2:
				com = "��";
				break;
			}

			// �⺻�ڷ���(int, double, ���)�� == ���� ��
			if ((name.equals(bo) && com.equals(ba)) || (name.equals(ga) && com.equals(bo)) || (name.equals(ba) && com.equals(ga))) {
				System.out.println("��� ��! ��ǻ��: " + com + " ��� : " + name);
				score += 10;
			} else if (name.equals(com)) {
				System.out.println("��� ��ǻ��: " + com + " ��� : " + name);
				score += 1;
			} else {
				System.out.println("��ǻ�� ��! ��ǻ��: " + com + " ��� : " + name);
				life -= 1;
			}
			System.out.println("���� ���� : " + score + " , ���� ������ : " + life);
			System.out.println();
			
			if(life == 0)
				break;
			
		}

	}

}
