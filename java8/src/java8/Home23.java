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
			
			System.out.print("수를 입력하세요 : ");
			int me = sc.nextInt();
		
			if(com > me)
			{
				System.out.println("입력하신 수 보다 큽니다.");
			}
			else if(com < me)
			{
				System.out.println("입력하신 수 보다 작습니다.");
			}
			
			if(com == me)
			{
				System.out.println("정답 입니다 정답은 : " + com);
				System.exit(0);
				
			}
		}
		
		
	}
}
