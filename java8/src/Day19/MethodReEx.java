package Day19;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class MethodReEx {

		public int add(int a, int b) {
			return a + b;
		}
		
		public static int mul(int a, int b) {
			return a + b;
		}
		
		public void oper(IntBinaryOperator operator, int a, int b) {
			System.out.println("정적/인스턴스 메소드 참조 : " + operator.applyAsInt(a, b));
		}
		
		public void opers(Function<String, String> stringOperator, String a) {
			System.out.println("매개변수의 메소드 참조 : " + stringOperator.apply(a));
		}
	public static void main(String[] args) {
		
		MethodReEx ex = new MethodReEx();
		
		ex.oper((a, b) -> MethodReEx.mul(a, b), 1, 1);
		ex.oper(MethodReEx::mul, 1, 1);
		
		ex.oper((a, b) -> ex.add(a, b), 1, 1);
		ex.oper(ex::add, 1, 1);
		
		ex.opers(s -> s.toLowerCase(), "String");
		ex.opers(String::toLowerCase, "String");
	}

}
