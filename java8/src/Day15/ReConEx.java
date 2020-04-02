package Day15;

public class ReConEx {

	public static void main(String[] args) {
			
			ReControl.ChanBattery();
			
			Tv tv = new Tv();
			Audio audio = new Audio();
//			ReControl rc = new ReControl();  인터페이스는 생성자 없음
			
			ReControl rc;     //변수는 정의할 수 있음
			
			rc = tv;    // 인터페이스 변수에는 구현 클래스의 객체가 대입됨
			rc = new Tv();
			
			rc.turnOn();
			rc.setVol(5);
			rc.setMute(true);
			rc.setMute(false);
			rc.turnOff();
			
			System.out.println("==========");
			
			rc = audio;
			
			rc.turnOn();
			rc.setVol(5);
			rc.setMute(true);
			rc.setMute(false);
			rc.turnOff();
			
			System.out.println("===========");
			
			rc = new ReControl() {

				@Override
				public void turnOn() {
					System.out.println("보일러킴");
				}

				@Override
				public void turnOff() {
					System.out.println("보일러끔");
				}

				@Override
				public void setVol(int vol) {
					System.out.println("온도 : " + vol);
				}
				
				};             // 인터페이스를 익명구현객체로 만들 수 있음
							   // 이새끼는 한번만 만들 수 있음
							   // 많이 사용 하니까 알아두기를 (굳이 클래스를 하나 만들어서 사용 할 필요가 없을 때)
				
				
				rc.turnOn();
				rc.setVol(5);
				rc.setMute(true);
				rc.setMute(false);
				rc.turnOff();
				
				System.out.println("================");
				
				rc = new IpTv();
				
				rc.turnOn();
				rc.setVol(5);
				rc.setMute(true);
				rc.setMute(false);
				rc.turnOff();
				
				rc = new IpTv2();
				
				rc.turnOn();
				rc.setVol(5);
				rc.setMute(true);
				rc.setMute(false);
				rc.turnOff();
	}
	

}
