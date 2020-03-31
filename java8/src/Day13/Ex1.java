package Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 입력 : ");
		String a = br.readLine();
		
		StringBuffer sb = new StringBuffer(a);
		
		System.out.println("입력한 문자열 : " + sb);
		
		sb.reverse();
		System.out.println("거꾸로 : " + sb);

	}

}
