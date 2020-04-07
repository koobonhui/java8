package Day18;

public class Func1Ex {

	public static void main(String[] args) {
		Func1 fu1 = new Func1() {               // �͸�����ü
			
			@Override
			public void method(int num) {
				System.out.println(num);
			}
		};
		
		fu1.method(10);
		
		Func1 fu2 = (int num) -> {             // ���ٽ�
			System.out.println(num);
		};
		
		fu2.method(100);
		
		Func1 fu3 = (num) -> System.out.println(num); // ���ٽ� int�� ���� ǥ�� ���ص� �ȴ�
		
		fu3.method(100);
		
		Func1 fu4 = num -> System.out.println(num); // ���ٽ� num�� �Ѱ��� (������ �ȴ�)
		
		fu4.method(100);
		
		Func1 fu5 = x -> System.out.println(x); // �Ű��������� ������ �� �ִ�.
		
		fu5.method(100);
	}

}
