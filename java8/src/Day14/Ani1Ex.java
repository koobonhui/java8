package Day14;

public class Ani1Ex {

	public static void main(String[] args) {
		
			Dog1 d = new Dog1();
			Cat2 c = new Cat2();
			
			d.sound();
			c.sound();
			System.out.println("=============");
			
			//������ �ڵ� Ÿ�� ��ȯ
			Ani1 ani1 = null;
			
			ani1 = new Dog1();
			ani1.sound();
			ani1 = new Cat2();
			ani1.sound();
			
			System.out.println("===========");
			
			//�޼ҵ� ������
			animalSound(new Dog1());
			animalSound(new Cat2());
	}
	static void animalSound(Ani1 ani1) {
		ani1.sound();
	}

}
