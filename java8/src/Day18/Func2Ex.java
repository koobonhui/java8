package Day18;

public class Func2Ex {

	public static void main(String[] args) {                 // �͸�����ü
		Func2 fu1 = new Func2() {
			
			@Override
			public int method(int x, int y) {
				int re = x + y;
				return re;
			}
		};
		System.out.println(fu1.method(10, 20));
		
		Func2 fu2 = (int x, int y) -> {
			int re = x + y;
			return re;
		};
		System.out.println(fu2.method(10, 20));
		
		Func2 fu3 = (x, y) -> {					// int���ΰ� �ƴϱ� int ���� ���� 2���̶� {}; �̰� ������
			
			return x + y;
		};
		System.out.println(fu3.method(10, 20));
		
		Func2 fu4 = (x, y) -> x + y;		// ��°��� �ϳ��� ���ϵ� �����ص� �ȴ�
		System.out.println(fu4.method(10, 20));
	}

}
