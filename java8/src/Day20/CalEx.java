package Day20;

public class CalEx {

	public static void main(String[] args) { // ������ ����ȭ
												
			Calculator cal = new Calculator();
			User1 user1 = new User1();
			User2 user2 = new User2();
			
			user1.setCalculator(cal);      // user1�� 100�ְ� 2�� ���� ���� user2�� 50�ְ� 2�� ��
			user2.setCalculator(cal);	   // �� �� user1�� ���� ���� 100���� 50���� �ٲ��־ �Ѵ� 50 ���
			user1.start();
			user2.start();
	}

}
