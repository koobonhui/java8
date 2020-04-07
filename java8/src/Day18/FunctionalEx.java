package Day18;

public class FunctionalEx{

	public static void main(String[] args) {
		Functional f1 = new Functional() {
			
			@Override
			public void method() {
				System.out.println("f1 익명구현객체로 메소드 호출");
			}
		};

		f1.method();
		
		Functional f2 = () -> {
			System.out.println("f2 람다식으로 메소드 호출");
		};
		
		f2.method();
		
		Functional f3 = () -> System.out.println("f3 람다식으로 메소드 호출");
		// 중괄호 영역이 한줄이면 {};삭제해도 된다
		f3.method();
	}

}
