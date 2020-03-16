package java8;

import java.io.*;


public class Home1 {

	public static void main(String[] args) throws IOException {
		String name;
		int num;
		int score;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("학번 입력 : ");
		num = Integer.parseInt(br.readLine());
		System.out.print("토익점수 입력 : ");
		score = Integer.parseInt(br.readLine());
		
		System.out.println("나의 이름은 " + name + " 입니다.");
		System.out.println("나의 학번은 " + num + " 입니다.");
		System.out.println("나의 점수는 " + score + " 입니다.");
		

	}

}
