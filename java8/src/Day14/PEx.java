package Day14;

public class PEx {

	public static void main(String[] args) {
			
			Pchild pc = new Pchild();
			
			pc.method1();
			pc.method2();
			pc.method3();
			
			Pparent pp = pc; // �ڽ��� �θ� ������ ���� (�ڵ�����ȯ)
			
			pp.method1();
			pp.method2();
//			pp.method3();   �θ��� ���¶� �޼ҵ�3�� �θ� ���� �׷��� ��� �Ұ���
			
//			pc = pp;  �ڽĿ��� �θ� ���� �� �� ����
			pc = (Pchild)pp; // ��������ȯ ����
	}

}
