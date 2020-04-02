package Day15;

public class Audio implements ReControl {

	int vol;
	
	@Override
	public void turnOn() {
			System.out.println("오디오 켜짐");
	}

	@Override
	public void turnOff() {
			System.out.println("오디오 꺼짐");
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
			System.out.println(this.vol + " 으로 변경 오디오");
	}	
		

}
