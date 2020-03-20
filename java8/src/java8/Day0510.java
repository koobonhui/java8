package java8;

import java.util.Scanner;

public class Day0510 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nan = (int)(Math.random() * 3);
		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		String com = "";
		String name = ""; 
		
		System.out.print("가위 바위 보 선택 (a = 가위 b = 바위 c = 보) : ");
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
				com = "가위";
				break;
			case 1 :
				com = "바위";
				break;
			case 2 :
				com = "보";
				break;
		}
		
		
		if((name == bo && com == ba) || (name == ga && com == bo) || (name == ba && com == ga))
		{
			System.out.println("사람 승! 컴퓨터: " + com + " 사람 : " + name);
		}
		else if(name == com)
		{
			System.out.println("비김 컴퓨터: " + com + " 사람 : " + name);
		}
		else
		{
			System.out.println("컴퓨터 승! 컴퓨터: " + com + " 사람 : " + name);
		}
	sc.close();	
		}
		
	

	}


