package Day15;

public class Tv implements ReControl {

	int vol;
	
	@Override
	public void turnOn() {
			System.out.println("tv ÄÑÁü");
	}

	@Override
	public void turnOff() {
			System.out.println("tv ²¨Áü");
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
			System.out.println(this.vol + " À¸·Î º¯°æ tv");
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute)
		{
			System.out.println("tv À½¼Ò°Å");
		}
		else
			System.out.println("tv À½¼Ò°Å ÇØÁ¦");
	}
	
		

}
