package Day18;

public class UsingLocalVariable {

		void method(int arg) {
			int localVar = 40;
			
			//arg = 31;			//final 특성때문에 수정불가
			//localVar = 41;    //final 특성때문에 수정불가
			
			Functional fi = () -> {                  // 객체의 특성을 가지고 있음
				System.out.println("arg : " + arg);           // 람다에서 변수를 사용하는 순간 Final로 바뀌기 때문에 변수를 수정할 수 없음
				System.out.println("localVar : " + localVar + "\n");
			};
			fi.method();
		}
		
		void method2(int x) {
			System.out.println(x);               // 원래 변수를 바꿀 수 있음
			x = 50;
			System.out.println(x);
		}
}
