package Day12;

public class Carre {
	
	//필드
		int gas;
		
	//메소드	
		void setGas(int gas) {
			this.gas = gas;
		}
		
		boolean isleftGas() {
			if (gas == 0)
			{
				System.out.println("Gas가 없다");
				return false;
			}
			System.out.println("Gas가 있다");
			return true;
		}
		
		void run() {
			while(true)
			{
				if(gas > 0)
				{
					System.out.println("달린다. 가스 잔량 : " + gas);
					gas -= 1;
				}
				else
				{
					System.out.println("멈춘다. 가스 잔량 : " + gas);
					return; // 메소드를 멈추게 하는 기능 있음
				}
			}
		}
}
