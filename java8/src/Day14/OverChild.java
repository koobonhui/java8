package Day14;

public class OverChild extends OverParent{
		
		void method3() {
			System.out.println("�ڽ� �޼ҵ�3");
		}
		
		@Override  // ������ �ϰڴٴ� �� �θ𿡰� ���� �޼ҵ� ������ ���� ��
		void method2() {
			System.out.println("�ڽ� �޼ҵ�2");
		}

}
