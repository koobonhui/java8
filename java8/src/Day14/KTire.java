package Day14;

public class KTire extends Tire{
		
	KTire(String location, int maxRo) {
		super(location, maxRo);
	}
	
	@Override
	boolean roll() {
		++accRo;
		if(accRo < maxRo)
		{
			System.out.println(location + " 금타수명 : " + (maxRo - accRo) + " 회");
			return true;
		}
		else
		{
			System.out.println(location + "금펑크");
			return false;
		}
	}
}
