package Day14;

public class Child extends Parent{
		Child(String name) {
			
			super(name);      //자동 생성
							  // 부모가 디폴트 값이 아니면 자식의 슈퍼에 값을 넣어줘야함
			System.out.println("자식이다");
		}
}
