package Day13;

public class StudentEX {

	public static void main(String[] args) {
		Student s = new Student("hong", "����", 30, 20200001);
		Student s1 = new Student();
		
		s1.setName("������");
		s1.setGender("����");
		s1.setAge(40);
		s1.setNo(202000002);
		
		s.show();
		System.out.println("=================");
		s1.show();
		

	}

}
