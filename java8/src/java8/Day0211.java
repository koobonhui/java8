package java8;

public class Day0211 {

	public static void main(String[] args) {
		char ch;
		String str;
		ch = 'A' + '1';
		System.out.println(ch);
		int res = ch;
		System.out.println(res);
		str = "A" + "1";
		System.out.println(str);
		String str2 = "10";
		int num2 = 10;
		String res2 = str2 + num2;
		System.out.println(res2);
		//숫자를 문자로
		int n1 = 10;
		int n2 = 20;
		System.out.println(n1 + "" + n2); //숫자 쌍따옴표 넣으면 문자 방법
		String str3 = String.valueOf(n1); //방법2
		
		//문자를 숫자로
		String str4 = "100";
		System.out.println(str4 + 100);
		int n3 = Integer.valueOf(str4);
		double n4 = Double.valueOf(str4);
		
		int n5 = Integer.parseInt(str4);
		double n6 = Double.parseDouble(str4);
		
		String str5 = "Hello";
//		int n7 = Integer.valueOf(str5);
//		int n7 = Integer.parseInt(str5);
//		System.out.println(n7);
	}

}
/*
 num1;
 num2;
 num3;
 num4;
 num5;
 num6;
 
 */
