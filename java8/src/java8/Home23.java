package java8;

import java.util.Random;
import java.util.Scanner;

public class Home23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int com = rd.nextInt(9) + 1;
		
		while(true)
		{
			System.out.println(com);
			
			System.out.print("���� �Է��ϼ��� : ");
			int me = sc.nextInt();
		
			if(com > me)
			{
				System.out.println("�Է��Ͻ� �� ���� Ů�ϴ�.");
			}
			else if(com < me)
			{
				System.out.println("�Է��Ͻ� �� ���� �۽��ϴ�.");
			}
			
			if(com == me)
			{
				System.out.println("���� �Դϴ� ������ : " + com);
				System.exit(0);
				
			}
		}
		
		
	}
}
