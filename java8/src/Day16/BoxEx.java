package Day16;

public class BoxEx {

	public static void main(String[] args) {
		
			String name = "홍길동";
			Box box = new Box();
			box.set(name);    // String -> Object 로 자동형변환 했다
			String name2 = (String)box.get();		  // Object로 받아야 받아짐 원래가 String 이니까 강제형변환 가능
			System.out.println(name2);
			
			Apple apple = new Apple();
			System.out.println(apple.hashCode());
			box.set(apple);           // Apple -> Object로 자동형변환
			Apple apple2 = (Apple)box.get();      // 오브젝트에서 애플로 강제형 변환
			System.out.println(apple2.hashCode());
			
			Box2<String> box2 = new Box2<>();    // 1.8버전 부터 한쪽만 넣어도 됨
			box2.set(name);            
			name2 = box2.get();
			System.out.println(name2);
			
//			box2.set(apple);  // box2는 제네릭으로 String만 사용해야하니까 Apple는 사용할 수 없다
			Box2<Apple> box3 = new Box2<>();
			box3.set(apple);
			apple2 = box3.get();
//			box3.set(name);   // box3은 Apple만 사용이 가능하다 그래서 String은 사용 불가
	}

}
