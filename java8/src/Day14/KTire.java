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
			System.out.println(location + " ��Ÿ���� : " + (maxRo - accRo) + " ȸ");
			return true;
		}
		else
		{
			System.out.println(location + "����ũ");
			return false;
		}
	}
}
