package Day12;

public class StringbufferEx {

	public static void main(String[] args) {
			StringBuffer sb = new StringBuffer("Java Programming");
			StringBuffer sb2;
			
			sb2 = sb.insert(5, "JSP "); // ���ϴ°��� ���� �߰�
			System.out.println(sb);
			System.out.println(sb2);
			
			sb.append(" Good ");  //���ڿ� �ڿ� �߰�
			sb.append('A');
			System.out.println(sb);
			
			sb2.reverse();   // ���ڿ� �ݴ��
			System.out.println(sb2);
			
			sb.setLength(10);  // ���ڿ� ũ�� ����
			System.out.println(sb);
			
	}

}
