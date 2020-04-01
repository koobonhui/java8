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
	}

}
