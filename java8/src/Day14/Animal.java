package Day14;

public class Animal {
	
		void speak() {
			System.out.println("울음소리");
		}
		
		void run() {
			System.out.println("뛴다");
		}
		
		void hau(Animal animal) {
			animal.speak();
		}

}
