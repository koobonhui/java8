package Day19;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {

	public static void main(String[] args) {

			IntBinaryOperator operator;
			
			operator = new IntBinaryOperator() { // 익명구현객체
				
				@Override
				public int applyAsInt(int left, int right) {
					return Calculator.staticMethod(left, right);
				}
			};
			int re = operator.applyAsInt(10, 20);
			System.out.println(re);
			
			
			operator = (int left, int right) -> {    // 람다식
				return Calculator.staticMethod(left, right);
			};
			
			operator = (x, y) -> Calculator.staticMethod(x, y); // 한줄이면 개 줄일수있음
			re = operator.applyAsInt(10, 20);
			System.out.println(re);
			
			operator = Calculator::staticMethod; // 정적 메소드 참조
			re = operator.applyAsInt(10, 20);
			System.out.println(re);
			
			
			Calculator cal = new Calculator();   
			operator = cal::instanceMethod;    // 인스턴스 메소드 참조 (인스턴스 메소드는 클래스명으로 호출 못함 객체 생성해야함)
			re = operator.applyAsInt(10, 20);
			System.out.println(re);
			
			
	}

}
