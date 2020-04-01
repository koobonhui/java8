package Day14;

public class OverChild extends OverParent{
		
		void method3() {
			System.out.println("자식 메소드3");
		}
		
		@Override  // 재정의 하겠다는 말 부모에게 없는 메소드 적으면 오류 뜸
		void method2() {
			System.out.println("자식 메소드2");
		}

}
