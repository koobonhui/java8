package Day16;

public class UtilEx {     // ���׸� �޼ҵ� ���

	public static void main(String[] args) {
		Box3<String> box = Util.<String>boxing("ȫ�浿");
		
		String name = box.get();          // String�� ����Ǿ� ����
		System.out.println(name);
		
		Box3<Integer> box2 = Util.boxing(100); // �ڵ����� Integer���� �տ� ������
											   // �޼ҵ� ȣ��� ���׸��� ���ߵǸ� �ڿ� ���� ����
		int num = box2.get();
		System.out.println(num);
	}

}
