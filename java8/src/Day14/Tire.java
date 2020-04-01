package Day14;

public class Tire {
		
		int maxRo;
		int accRo;
		String location;
		
		Tire(String location, int maxRo) {
			this.location = location;
			this.maxRo = maxRo;
		}
		
		boolean roll() {
			++accRo;
			if(accRo < maxRo)
			{
				System.out.println(location + " ���� : " + (maxRo - accRo) + " ȸ");
				return true;
			}
			else
			{
				System.out.println(location + "��ũ");
				return false;
			}
		}
}
