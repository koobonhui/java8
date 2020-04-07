package Day18;

public class Func1Ex {

	public static void main(String[] args) {
		Func1 fu1 = new Func1() {               // 익명구현객체
			
			@Override
			public void method(int num) {
				System.out.println(num);
			}
		};
		
		fu1.method(10);
		
		Func1 fu2 = (int num) -> {             // 람다식
			System.out.println(num);
		};
		
		fu2.method(100);
		
		Func1 fu3 = (num) -> System.out.println(num); // 람다식 int를 굳이 표현 안해도 된다
		
		fu3.method(100);
		
		Func1 fu4 = num -> System.out.println(num); // 람다식 num도 한개면 (지워도 된다)
		
		fu4.method(100);
		
		Func1 fu5 = x -> System.out.println(x); // 매개변수명을 변경할 수 있다.
		
		fu5.method(100);
	}

}
