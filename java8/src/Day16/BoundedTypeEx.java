package Day16;

public class BoundedTypeEx {

	public static void main(String[] args) {
//		String str;       ��Ʈ���� �ѹ��� ��� ��� ����
		
//		String str = Util.compare("a", "b");
		
		int re1 = Util2.<Integer>compare(10, 20);       // t1, t2�� int���̶� Integer�� ���߰����ؼ� ���� ����
		System.out.println(re1);                  // -1 ����
		
		int re2 = Util2.compare(4.5, 3);             // t1 = double t2 = int
		System.out.println(re2);           //   1 ����
		
		int re3 = Util2.compare(100, 100);
		System.out.println(re3);            //  0 ����
	}

}
