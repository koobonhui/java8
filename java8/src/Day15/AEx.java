package Day15;

public class AEx {

	public static void main(String[] args) {
		A.C.field2 = 10;           // static 멤버는 객체없이 사용 가능
		A.C.method2();
		
		A.C c = new A.C();       //객체를 만들어서 인스턴스를 부를 수 있음
		c.fiedl1 = 10;
		c.field2 = 10;
		c.method1();
		c.method2();
		
		A a = new A();                 //인스턴스 멤버 클래스의 객체화(정적 맴버 클래스와 객체화 코드 다름)
		A.B b = a.new B();
		b.field1 = 10;
		b.method1();
		
		a.method();        // 로컬 클래스 D를 사용하는 메소드
	}

}
