package java8;

public class Day0203 {

	public static void main(String[] args) {
		int number1 = 1000000000;
		int number2 = 2000000000;
		int sum = number1 + number2;
		
		System.out.println(sum);
		
		long sum2 = number1 + number2;
		
		System.out.println(sum2);
		
		long num1 = 1000000000;
		long num2 = 2000000000;
		
		long sum3 = num1 + num2;
		
		System.out.println(sum3);
		
		long sum4 = 1000000000L + 2000000000L;
		System.out.println(sum4);
		
		byte n1 = 15;
		byte n2 = 1;
		
		int sum5 = n1 + n2;
		
		System.out.println(sum5);
		
		short n3 = 3000;
		short n4 = 5000;
		
		int sum6 = n3 + n4;
		
		System.out.println(sum6);
		
		long sum7 = n3 + n4; // 자동형변환, 묵시적형변환
		
//		int sum8 = 10L; 큰거를 작은거에 못담아서 오류남 (ctrl + 7 주석처리)
		
		int a1 = 10;
		int a2 = 20;
		
		short sum9 = (short)(a1 + a2); //강제형변환, 명시적형변환, casting
		
		System.out.println(sum9);
		
		int a3 = 10000;
		int a4 = 30000;
		
		short sum10 = (short)(a3 + a4); // 오버플로우 아니고 표현 못하는거 버림
		
		System.out.println(sum10);
		
		
		
	}

}
