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
						System.out.println("앞왼 한타로 교체");
						car.fleft = new HanTire("앞왼", 15);
						break;
					
					case 2 :
						System.out.println("앞오 금타로 교체");
						car.fright = new KTire("앞오", 13);
						break;
						
					case 3 :
						System.out.println("뒤왼 한타로 교체");
						car.bleft = new HanTire("뒤왼", 14);
						break;
						
					case 4 :
						System.out.println("뒤오 금타로 교체");
						car.bright = new KTire("뒤오", 17);
						break;
				}
				System.out.println("===========================");
			}
	}

}
