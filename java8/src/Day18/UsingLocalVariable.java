package Day18;

public class UsingLocalVariable {

		void method(int arg) {
			int localVar = 40;
			
			//arg = 31;			//final Ư�������� �����Ұ�
			//localVar = 41;    //final Ư�������� �����Ұ�
			
			Functional fi = () -> {                  // ��ü�� Ư���� ������ ����
				System.out.println("arg : " + arg);           // ���ٿ��� ������ ����ϴ� ���� Final�� �ٲ�� ������ ������ ������ �� ����
				System.out.println("localVar : " + localVar + "\n");
			};
			fi.method();
		}
		
		void method2(int x) {
			System.out.println(x);               // ���� ������ �ٲ� �� ����
			x = 50;
			System.out.println(x);
		}
}
