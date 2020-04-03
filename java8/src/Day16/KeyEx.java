package Day16;

public class KeyEx {

	public static void main(String[] args) {
		
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		
		System.out.println(k1 == k2);
		System.out.println(k1.equals(k2));          // 객체와 객체를 비교
		System.out.println("========================");
		System.out.println(k1.hashCode());          // 주소
		System.out.println(k2.hashCode());
		System.out.println("=========================");
		System.out.println(k1.toString());          // 문자열 출력
	}

}
