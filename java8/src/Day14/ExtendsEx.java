package Day14;

public class ExtendsEx {

	public static void main(String[] args) {
		
			CarExtends car = new CarExtends();
			
			for(int i = 1; i <= 5; i++)
			{
				int pLocation = car.run();
				switch(pLocation)
				{
					case 1 :
						System.out.println("�տ� ��Ÿ�� ��ü");
						car.fleft = new HanTire("�տ�", 15);
						break;
					
					case 2 :
						System.out.println("�տ� ��Ÿ�� ��ü");
						car.fright = new KTire("�տ�", 13);
						break;
						
					case 3 :
						System.out.println("�ڿ� ��Ÿ�� ��ü");
						car.bleft = new HanTire("�ڿ�", 14);
						break;
						
					case 4 :
						System.out.println("�ڿ� ��Ÿ�� ��ü");
						car.bright = new KTire("�ڿ�", 17);
						break;
				}
				System.out.println("===========================");
			}
	}

}
