package java8;

public class Day0210 {

	public static void main(String[] args) {
		double apple = 1.0;
		double unit = 0.1;
		
		System.out.println("��� �� ���� 10�������� ������");
		System.out.println("7������ �Ծ����ϴ�.");
		System.out.println("���� ������ �� �����ϱ��?");
		
		double re = apple - unit * 7;
		
		System.out.println(re); //�ε��Ҽ��� ����ؼ� ��Ȯ�� ��� �ȵ�
		                        //������ �����ϰ� �Ǽ��� ǥ��
		
		double re2 = 10000000000000000000000000.0 + 1.0;
		System.out.println(re2);
		
		int apple2 = 1;
		double unit2 = 1;
		double re3 = (apple2 * 10 - unit2 * 7) / 10;
		System.out.println(re3);
	}

}
