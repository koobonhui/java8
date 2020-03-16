package java8;

import java.util.Scanner;

public class ScanEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두명 이름 입력 : ");
		String text = sc.nextLine();
		System.out.println(text);
		sc.close();
	}

}
