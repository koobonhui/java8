package Day13;

public class SingletonEx {

	public static void main(String[] args) {
			Singleton s;
//			s = new Singleton();  // ������ ȣ���� �Ұ���
			s = Singleton.getInstance(); // ������ ������ ��ü�� ȣ��
			
			Singleton s1 = Singleton.getInstance();
			
			if(s == s1)
			{
				System.out.println("����");
			}
			else
				System.out.println("�ٸ�");
			
			Member m1 = new Member("ȫ", "hong");
			Member m2 = new Member("ȫ", "hong");
			
			if(m1 == m2)
			{
				System.out.println("����");
			}
			else
				System.out.println("�ٸ�");

	}

}
