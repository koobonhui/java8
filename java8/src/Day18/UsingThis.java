package Day18;

public class UsingThis {
	public int outterF = 10;
	
	class Inner {
		int innerF = 20;
		
		void method() {
			Functional fi = () -> {
				System.out.println("outer " + outterF);      // public int outterF = 10; 호출
				System.out.println("outer : " + UsingThis.this.outterF);
				System.out.println("inner : " + innerF);
				System.out.println("inner : " + this.innerF + "\n");
			};
			fi.method();
			
			Functional fi2 = new Functional() {
				
				@Override
				public void method() {
					System.out.println("outer " + outterF);      
					System.out.println("outer : " + UsingThis.this.outterF);
					System.out.println("inner : " + innerF);
					System.out.println("inner : " + Inner.this.innerF + "\n");  // 객체를 만들었음 그래서 객체의 영역임
																		//inner.this.innerf로 해야함
					
				}
			};
			fi2.method();
		}
	}
	}


