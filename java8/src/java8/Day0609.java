package java8;

import java.util.Scanner;

public class Day0609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		String com = "";
		String name = "";
		int score = 0;
		int life = 3;
		
		while (true) 
		{
			int nan = (int) (Math.random() * 3);
			System.out.print("가위 바위 보 선택 (a = 가위 b = 바위 c = 보 q = 종료) : ");
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
				System.out.println("종료");
				break;
			}	

			switch (nan) {
			case 0:
				com = "가위";
				break;
			case 1:
				com = "바위";
				break;
			case 2:
				com = "보";
				break;
			}

			// 기본자료형(int, double, 등등)은 == 으로 비교
			if ((name.equals(bo) && com.equals(ba)) || (name.equals(ga) && com.equals(bo)) || (name.equals(ba) && com.equals(ga))) {
				System.out.println("사람 승! 컴퓨터: " + com + " 사람 : " + name);
				score += 10;
			} else if (name.equals(com)) {
				System.out.println("비김 컴퓨터: " + com + " 사람 : " + name);
				score += 1;
			} else {
				System.out.println("컴퓨터 승! 컴퓨터: " + com + " 사람 : " + name);
				life -= 1;
			}
			System.out.println("현재 점수 : " + score + " , 현재 라이프 : " + life);
			System.out.println();
			
			if(life == 0)
				break;
			
		}

	}

}
