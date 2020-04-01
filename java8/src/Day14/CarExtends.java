package Day14;

public class CarExtends {
	
		Tire fleft = new Tire("¾Õ¿Þ", 6);
		Tire fright = new Tire("¾Õ¿À", 2);
		Tire bleft = new Tire("µÚ¿Þ", 3);
		Tire bright = new Tire("µÚ¿À", 4);
		
		int run() {
			System.out.println("´Þ¸°´Ù");
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
			System.out.println("¸ØÃã");
		}
}
