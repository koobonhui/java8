package Day15;

public class IpTv implements ReControl, Internet {

	// 이것도 다중 구현이 되지만, 다중상속의 문제점 처럼 같은 메소드가 들어 있다면 곤한함
	// 그래서 인터페이스 마다 메소드 안겹치게 잘 만들어야함
	private int vol;
	
	@Override
	public void searchWeb() {
		System.out.println("인터넷 검색");
	}

	@Override
	public void turnOn() {
		System.out.println("켬");
	}

	@Override
	public void turnOff() {
		System.out.println("끔");
	}

	@Override
	public void setVol(int vol) {
		this.vol = vol;
		System.out.println(this.vol + " 로 변경");
	}
	
		
}
