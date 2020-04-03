package Day16;

public class BoundedTypeEx {

	public static void main(String[] args) {
//		String str;       스트링은 넘버와 상관 없어서 못씀
		
//		String str = Util.compare("a", "b");
		
		int re1 = Util2.<Integer>compare(10, 20);       // t1, t2가 int값이라 Integer로 유추가능해서 생략 가능
		System.out.println(re1);                  // -1 리턴
		
		int re2 = Util2.compare(4.5, 3);             // t1 = double t2 = int
		System.out.println(re2);           //   1 리턴
		
		int re3 = Util2.compare(100, 100);
		System.out.println(re3);            //  0 리턴
	}

}
