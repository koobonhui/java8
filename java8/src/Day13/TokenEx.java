package Day13;

import java.util.StringTokenizer;

public class TokenEx {

	public static void main(String[] args) {
		String now = "2020/ 03/ 31";
		StringTokenizer str = new StringTokenizer(now, "/");
		
		int cnt = str.countTokens(); // 토큰갯수
		System.out.println(cnt);
		
		while(str.hasMoreTokens())  //남은토큰이 있는지
		{
			String temp = str.nextToken(); // 파싱해서 구한 토큰을 반환
			System.out.println(temp);
		}
		
		String[] a = now.split("/");   // 배열로 짜르기
		
		for(String st : a)
		{
			System.out.println(st);
		}

	}

}
