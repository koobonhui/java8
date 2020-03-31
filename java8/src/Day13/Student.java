package Day13;

public class Student {   
		
		private String name;
		private String gender;
		private int age;
		private int no;
		
		public Student(String name, String gender, int age, int no) {  // ��Ŭ �ҽ��� ������ �����ϱ� �ϸ� ���� ���� �� ����
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.no = no;
		}
		
		public Student() {
			
		}
		
		public String getName() {         // ��Ŭ�� �ҽ� getter setter �����ϱ� �ϸ� ���� ���� �� ����
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			if(gender.equals("����"))
			{
				no += 2000;
			}
			else
			{
				no += 1000;
			}
			this.no = no;
		}
		
		public void show() {
			System.out.println(name);
			System.out.println(gender);
			System.out.println(age);
			System.out.println(no);
		}
		
		
	

}
