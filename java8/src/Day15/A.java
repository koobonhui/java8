package Day15;

public class A {
	A(){
		System.out.println("A객체 생성");
	}
		//인스턴스 멤버 클래스
	class B {
		B() {
			System.out.println("B객체 생성");
		}
		
		int field1;
		
		//static int field2;    인스턴스 맴버는 static 못가짐
		
		void method1() {
		}
		
		//static void method2(){} 
	}
	
	//정적 멤버 클래스
	static class C {                  //클래스를 선언할 때 스테틱만 스테틱 가짐
			C() {
				System.out.println("C객체 생성");
			}
			
			int fiedl1;          // 스테틱 맴버는 인스턴스와 스테틱 가짐
			static int field2;
			
			void method1() {
				
			}
			static void method2() {
				
			}
		}
	
	void method() {
			//로컬 클래스
			class D {          // 인스턴스만 가질 수 있음 로컬도
				D() {
					System.out.println("D객체 생성");
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
	//인스턴스 필드
	B outerField1 = new B();  // O
	C outerField2 = new C();   // O
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();   // O
		C var2 = new C();   // O
	}
	
	//정적 필드 초기화
	//static B outerField3 = new B(); // x A객체 없음
	static C outerField4 = new C(); // O 정적은 가능
	
	static void method2() {
		// B var1 = new B();  x A객체없음
		C var2 = new C(); // O 정적은 가능
	}
}

