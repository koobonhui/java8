package Day16;

public class MemberThinEx {   

	public static void main(String[] args) {

		//���� ��ü ����
		MemberThin ori = new MemberThin("blue", "ȫ�浿", "12345", 25, true);
		
		//���� ��ü�� ���� �� �н����� ����
//		MemberThin clone = ori.getMember();      // ��ü�� ���� �����ؼ� �����ϴ°Ŷ� ���� �ٸ� (��������)
		MemberThin clone = ori;             // ��������
		
		clone.password = "09876";
		
		System.out.println(ori.hashCode());
		System.out.println(clone.hashCode());
		System.out.println();
		
		System.out.println("���� ��ü�� �ʵ尪");
		System.out.println("id : " + clone.id);
		System.out.println("name : " + clone.name);
		System.out.println("password : " + clone.password);
		System.out.println("age : " + clone.age);
		System.out.println("adult : " + clone.adult);
		
		System.out.println("========================");
		
		System.out.println("���� ��ü�� �ʵ尪");
		System.out.println("id : " + ori.id);
		System.out.println("name : " + ori.name);
		System.out.println("password : " + ori.password);
		System.out.println("age : " + ori.age);
		System.out.println("adult : " + ori.adult);
	}

}
