package Day15;

public class Tv implements ReControl {

	int vol;
	
	@Override
	public void turnOn() {
			System.out.println("tv ����");
	}

	@Override
	public void turnOff() {
			System.out.println("tv ����");
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
			System.out.println(this.vol + " ���� ���� tv");
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute)
		{
			System.out.println("tv ���Ұ�");
		}
		else
			System.out.println("tv ���Ұ� ����");
	}
	
		

}
