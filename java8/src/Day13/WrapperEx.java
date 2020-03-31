package Day13;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx {

	public static void main(String[] args) {
		
		int num = 10;
		//박싱하는 법
		Integer i = new Integer(num); // 매개변수는 기본값 또는 문자열을 입력할 수 있다.
		Integer i2 = Integer.valueOf(i);
		
		//언박싱하는 법
		num = i.intValue();
		
		//자동 박싱
		Integer a = num;
		
		//자동 언박싱
		int re = a + 10;
		System.out.println(re);
		
		//리스트는 객체를 필요로 하는데 이럴때 int를 박싱해서 함
		List<Integer> list = new ArrayList();
	}

}
