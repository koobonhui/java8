package Day16;

public class Person {

		private String name;
		
		public Person(String name) {       // ������
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public String toString() {      // ������Ʈ�� �ִ� toString�� ������ �Ѱ��� @Override�� �´� ǥ��
			return name;
		}
}
