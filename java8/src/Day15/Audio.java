package Day15;

public class Audio implements ReControl {

	int vol;
	
	@Override
	public void turnOn() {
			System.out.println("����� ����");
	}

	@Override
	public void turnOff() {
			System.out.println("����� ����");
	}

	@Override
	public void setVol(int vol) {
			if(vol > MAX_VOL)
			{
				this.vol = MAX_VOL;
			}
			else if(vol < MIN_VOL)
			{
				this.vol = MIN_VOL;
			}
			else
				this.vol = vol;
			System.out.println(this.vol + " ���� ���� �����");
	}	
		

}
