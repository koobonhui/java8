package java8;

import java.util.Scanner;

public class Day0503 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어점수 입력(0 ~ 100) : ");
		int score = sc.nextInt();
		String pass = "";
		/*
		if (score >= 60)
		{
			//System.out.println("합격");
			pass = "합";
		}
		{
			
		}
		else
		{
			//System.out.println("불합격");
			pass = "불";
		}
		*/
		if (score >= 90)
		{
			//System.out.println("합격");
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
			//System.out.println("불합격");
			pass = "F";
		}
		System.out.println(pass);
		System.out.println("시험 성적은 " + pass + " 입니다.");
		sc.close();
		//90이상 a 90미만80이상 b 80미만70이상 c 70미만60이상 d 60미만 f

	}

}
