package java8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chap02Q02 {

	public static void main(String[] args) throws Exception  {
		int num;
		double num2;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 실수 입력 : ");
		num = Integer.parseInt(br.readLine());
		num2 = Double.parseDouble(br.readLine());
		System.out.println(num);
		System.out.println(num2);

	}

}
