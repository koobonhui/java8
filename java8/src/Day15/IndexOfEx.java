package Day15;

public class IndexOfEx {

	public static void main(String[] args) {

			String str = "�ڹ� ���α׷���";
			int in = str.indexOf("����");
			
			System.out.println(in);
			
			in = str.indexOf("C���");   // ã�°� ������ -1 ����
			
			System.out.println(in);
			
			str = "�ڹ��ڹ��ڹ� �������� �׷��������Դϴ�";
			
			in = str.indexOf("��");  // �Ű������� �� ���� ���� 0������ �˻� �Ѵ�
			
			System.out.println(in);
			
			in = str.indexOf("��", in + 1); // 2��°�� �ٸ� �˻��ҷ��� 2������ �˻��ؾ���
											// ù����� �˻���, �ι�°�� �˻� ���� ��ġ
			System.out.println(in);
			
			in = str.indexOf("��", in + 1);
			
			System.out.println(in);
			
			in = str.indexOf("��", in + 1);
			
			System.out.println(in);
			
			String str2 = str.replace("�������� ", "���� ");  // ���÷��̽��� ���ϴ� ���ڷ� ������
			System.out.println(str2);
			String str3 = str.replace("�ڹ�", "JAVA");
			System.out.println(str3);
			
	}

}
