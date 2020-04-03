package Day16;

public class Person {

		private String name;
		
		public Person(String name) {       // 생성자
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public String toString() {      // 오브젝트에 있는 toString을 재정의 한거임 @Override가 맞는 표현
			return name;
		}
}
