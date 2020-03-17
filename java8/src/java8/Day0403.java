package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0403 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); //문자만 입력(숫자도 문자로 인식)
		
		System.out.print("키보드 입력 : ");
		String str = br.readLine();
		System.out.println(str);
		
		System.out.print("숫자 입력 : ");
		String num = br.readLine();
		int num1 = Integer.parseInt(num); //문자열을 숫자로 바꿈
		System.out.println(num + 10);
		System.out.println(num1 + 10);
		
		br.close();
		isr.close();
	}

}
