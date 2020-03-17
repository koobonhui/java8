package java8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chap02Q01 {

	public static void main(String[] args) throws Exception  {
		int num;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도 입력 : ");
		num = Integer.parseInt(br.readLine());
		System.out.println(num);

	}

}
