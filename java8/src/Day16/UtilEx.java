package Day16;

public class UtilEx {     // 제네릭 메소드 사용

	public static void main(String[] args) {
		Box3<String> box = Util.<String>boxing("홍길동");
		
		String name = box.get();          // String이 저장되어 있음
		System.out.println(name);
		
		Box3<Integer> box2 = Util.boxing(100); // 자동으로 Integer해줌 앞에 적으면
											   // 메소드 호출시 제네릭이 유추되면 뒤에 생략 가능
		int num = box2.get();
		System.out.println(num);
	}

}
