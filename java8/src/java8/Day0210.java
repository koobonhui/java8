package java8;

public class Day0210 {

	public static void main(String[] args) {
		double apple = 1.0;
		double unit = 0.1;
		
		System.out.println("사과 한 개를 10조각으로 나눠서");
		System.out.println("7조각을 먹었습니다.");
		System.out.println("남은 조각은 몇 조각일까요?");
		
		double re = apple - unit * 7;
		
		System.out.println(re); //부동소수로 계산해서 정확히 계산 안됨
		                        //정수로 연산하고 실수로 표현
		
		double re2 = 10000000000000000000000000.0 + 1.0;
		System.out.println(re2);
		
		int apple2 = 1;
		double unit2 = 1;
		double re3 = (apple2 * 10 - unit2 * 7) / 10;
		System.out.println(re3);
	}

}
