package Day18;

public class Func2Ex {

	public static void main(String[] args) {                 // 익명구현객체
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
		
		Func2 fu3 = (x, y) -> {					// int값인거 아니까 int 삭제 가능 2줄이라 {}; 이거 들어가야함
			
			return x + y;
		};
		System.out.println(fu3.method(10, 20));
		
		Func2 fu4 = (x, y) -> x + y;		// 출력값이 하나면 리턴도 삭제해도 된다
		System.out.println(fu4.method(10, 20));
	}

}
