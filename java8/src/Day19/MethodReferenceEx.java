package Day19;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {

	public static void main(String[] args) {

			IntBinaryOperator operator;
			
			operator = new IntBinaryOperator() { // �͸�����ü
				
				@Override
				public int applyAsInt(int left, int right) {
					return Calculator.staticMethod(left, right);
				}
			};
			int re = operator.applyAsInt(10, 20);
			System.out.println(re);
			
			
			operator = (int left, int right) -> {    // ���ٽ�
				return Calculator.staticMethod(left, right);
			};
			
			operator = (x, y) -> Calculator.staticMethod(x, y); // �����̸� �� ���ϼ�����
			re = operator.applyAsInt(10, 20);
			System.out.println(re);
			
			operator = Calculator::staticMethod; // ���� �޼ҵ� ����
			re = operator.applyAsInt(10, 20);
			System.out.println(re);
			
			
			Calculator cal = new Calculator();   
			operator = cal::instanceMethod;    // �ν��Ͻ� �޼ҵ� ���� (�ν��Ͻ� �޼ҵ�� Ŭ���������� ȣ�� ���� ��ü �����ؾ���)
			re = operator.applyAsInt(10, 20);
			System.out.println(re);
			
			
	}

}
