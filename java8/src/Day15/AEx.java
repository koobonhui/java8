package Day15;

public class AEx {

	public static void main(String[] args) {
		A.C.field2 = 10;           // static ����� ��ü���� ��� ����
		A.C.method2();
		
		A.C c = new A.C();       //��ü�� ���� �ν��Ͻ��� �θ� �� ����
		c.fiedl1 = 10;
		c.field2 = 10;
		c.method1();
		c.method2();
		
		A a = new A();                 //�ν��Ͻ� ��� Ŭ������ ��üȭ(���� �ɹ� Ŭ������ ��üȭ �ڵ� �ٸ�)
		A.B b = a.new B();
		b.field1 = 10;
		b.method1();
		
		a.method();        // ���� Ŭ���� D�� ����ϴ� �޼ҵ�
	}

}
