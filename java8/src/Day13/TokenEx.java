package Day13;

import java.util.StringTokenizer;

public class TokenEx {

	public static void main(String[] args) {
		String now = "2020/ 03/ 31";
		StringTokenizer str = new StringTokenizer(now, "/");
		
		int cnt = str.countTokens(); // ��ū����
		System.out.println(cnt);
		
		while(str.hasMoreTokens())  //������ū�� �ִ���
		{
			String temp = str.nextToken(); // �Ľ��ؼ� ���� ��ū�� ��ȯ
			System.out.println(temp);
		}
		
		String[] a = now.split("/");   // �迭�� ¥����
		
		for(String st : a)
		{
			System.out.println(st);
		}

	}

}
