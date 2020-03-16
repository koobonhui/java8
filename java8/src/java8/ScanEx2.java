package java8;

import java.util.Scanner;

public class ScanEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두명 이름 입력 : ");
		String text = sc.next();
		System.out.println(text);
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		sc.close();
	}

}
