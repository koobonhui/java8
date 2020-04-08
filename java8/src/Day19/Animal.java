package Day19;

public class Animal {

		String kind;
		int age;
		
		public Animal(String kind, int age) {
			super();
			this.kind = kind;
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "Animal [kind = " + kind + ", age = " + age + "]";
		}
		
}
