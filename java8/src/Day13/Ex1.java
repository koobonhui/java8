package Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �Է� : ");
		String a = br.readLine();
		
		StringBuffer sb = new StringBuffer(a);
		
		System.out.println("�Է��� ���ڿ� : " + sb);
		
		sb.reverse();
		System.out.println("�Ųٷ� : " + sb);

	}

}
