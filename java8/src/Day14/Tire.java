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
				System.out.println(location + " ¼ö¸í : " + (maxRo - accRo) + " È¸");
				return true;
			}
			else
			{
				System.out.println(location + "ÆãÅ©");
				return false;
			}
		}
}
