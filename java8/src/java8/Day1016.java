package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1016 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int [] me = new int[3];
		int [] com = new int[3];
			
		do
		{
			for(int i = 0; i < com.length; i++)
			{
				com[i] = ran.nextInt(9) + 1;
			}
		}
		while(com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);
	
		for(int i = 0; i < com.length; i++)
		{
			System.out.print(com[i]+ " ");
		}
		
		System.out.println();
		System.out.println("===================");
		
		while(true) {
			
			int strike = 0;
			int ball = 0;
			
			for(int i=0; i<3; i++) 
			{
				System.out.print("[" + (i+1) + "]1~9 입력 : ");
				int num = scan.nextInt();
				
				int check = 1;
				
				for(int j=0; j<i; j++) {
					if(num == me[j]) {
						check = -1;
					}
				}
				
				if(check == -1) {
					i = i - 1;
				}else {
					me[i] = num;
				}
			}
		for(int i =0; i<3; i++) {
				for(int j = 0 ; j<3 ; j++) {
					if(me[i]==com[j]) {
						if(i==j) {
							strike += 1;
						}
						else {
							ball += 1;
						}
					}
				}
			}
			System.out.println(+strike+"s"+" "+ball+"b");
			
			if(strike == 3) {
				System.out.println("정답입니다!");
				break;
			}
		}

	}

}
