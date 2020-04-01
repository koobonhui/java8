package Day14;

public class PEx {

	public static void main(String[] args) {
			
			Pchild pc = new Pchild();
			
			pc.method1();
			pc.method2();
			pc.method3();
			
			Pparent pp = pc; // 자식은 부모에 대입이 가능 (자동형변환)
			
			pp.method1();
			pp.method2();
//			pp.method3();   부모의 형태라 메소드3은 부모에 없음 그래서 사용 불가능
			
//			pc = pp;  자식에게 부모를 대입 할 수 없음
			pc = (Pchild)pp; // 강제형변환 가능
			pc.method3(); 		 
			
			Pparent pp2 = new Pparent();
			if(pp2 instanceof Pchild)	// 검사할 객체 instanceof 비교할 타입
			{
				pc = (Pchild)pp2;		// 강제형변환은 원래의 형태로 복구만 가능
				pc.method3();			// 원래 자식이었던거를 자식으로 바꿀 수 있지 원래 부모를 자식으로 못바꿈				
			}
			else
				System.out.println("강제형변환 x");
	}

}
