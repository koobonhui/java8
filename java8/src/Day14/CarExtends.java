package Day14;

public class CarExtends {
	
		Tire fleft = new Tire("�տ�", 6);
		Tire fright = new Tire("�տ�", 2);
		Tire bleft = new Tire("�ڿ�", 3);
		Tire bright = new Tire("�ڿ�", 4);
		
		int run() {
			System.out.println("�޸���");
			if(fleft.roll() == false)
			{
				stop();
				return 1;
			}
			if(fright.roll() == false)
			{
				stop();
				return 2;
			}
			if(bleft.roll() == false)
			{
				stop();
				return 3;
			}
			if(bright.roll() == false)
			{
				stop();
				return 4;
			}
			return 0;
		}
		
		void stop() {
			System.out.println("����");
		}
}
