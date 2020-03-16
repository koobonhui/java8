package java8;

import java.util.Scanner;

public class Day0205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pw;
		System.out.println("비밀번호를 \n입력해\t주세요.");
		System.out.print("비밀번호 : ____");
		pw = sc.nextInt();
		System.out.print("입력하신 비밀번호는 \"");
		System.out.print(pw);
		System.out.print("\" 입니다.");
		sc.close();
	}

}
