package Day13;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx {

	public static void main(String[] args) {
		
		int num = 10;
		//�ڽ��ϴ� ��
		Integer i = new Integer(num); // �Ű������� �⺻�� �Ǵ� ���ڿ��� �Է��� �� �ִ�.
		Integer i2 = Integer.valueOf(i);
		
		//��ڽ��ϴ� ��
		num = i.intValue();
		
		//�ڵ� �ڽ�
		Integer a = num;
		
		//�ڵ� ��ڽ�
		int re = a + 10;
		System.out.println(re);
		
		//����Ʈ�� ��ü�� �ʿ�� �ϴµ� �̷��� int�� �ڽ��ؼ� ��
		List<Integer> list = new ArrayList();
	}

}
