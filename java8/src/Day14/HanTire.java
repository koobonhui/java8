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
			System.out.println(location + " ��Ÿ���� : " + (maxRo - accRo) + " ȸ");
			return true;
		}
		else
		{
			System.out.println(location + "��Ÿ��ũ");
			return false;
		}
	}
}
