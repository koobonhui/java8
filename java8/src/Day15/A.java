package Day15;

public class A {
	A(){
		System.out.println("A��ü ����");
	}
		//�ν��Ͻ� ��� Ŭ����
	class B {
		B() {
			System.out.println("B��ü ����");
		}
		
		int field1;
		
		//static int field2;    �ν��Ͻ� �ɹ��� static ������
		
		void method1() {
		}
		
		//static void method2(){} 
	}
	
	//���� ��� Ŭ����
	static class C {                  //Ŭ������ ������ �� ����ƽ�� ����ƽ ����
			C() {
				System.out.println("C��ü ����");
			}
			
			int fiedl1;          // ����ƽ �ɹ��� �ν��Ͻ��� ����ƽ ����
			static int field2;
			
			void method1() {
				
			}
			static void method2() {
				
			}
		}
	
	void method() {
			//���� Ŭ����
			class D {          // �ν��Ͻ��� ���� �� ���� ���õ�
				D() {
					System.out.println("D��ü ����");
				}
				
				int field1;
				
				//static int field2;
				
				void method1() {
					
				}
				//static void method2(){}
			}
			D d = new D();                       
			d.field1 = 3;
			d.method1();
		}
	//�ν��Ͻ� �ʵ�
	B outerField1 = new B();  // O
	C outerField2 = new C();   // O
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();   // O
		C var2 = new C();   // O
	}
	
	//���� �ʵ� �ʱ�ȭ
	//static B outerField3 = new B(); // x A��ü ����
	static C outerField4 = new C(); // O ������ ����
	
	static void method2() {
		// B var1 = new B();  x A��ü����
		C var2 = new C(); // O ������ ����
	}
}

