package Day14;

public class HanTire extends Tire{
		
	HanTire(String location, int maxRo) {
		super(location, maxRo);
	}
	
	@Override
	boolean roll() {
		++accRo;
		if(accRo < maxRo)
		{
			System.out.println(location + " 한타수명 : " + (maxRo - accRo) + " 회");
			return true;
		}
		else
		{
			System.out.println(location + "한타펑크");
			return false;
		}
	}
}
