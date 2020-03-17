package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap02Q05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double pie = 3.14159;
		int a;
		
		System.out.print("반지름을 입력하세요 : ");
		a = Integer.parseInt(br.readLine());
		
		double sum = 2 * (pie * a);
		
		System.out.printf("%.2f",sum);

	}

}
