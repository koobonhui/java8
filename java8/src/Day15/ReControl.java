package Day15;

public interface ReControl {   // 인터페이스의 메소드는 기본적으로 public
							   // 재정의 할 때 더 강한걸로 변경 할 수 없다
							   // public < protected < default < private 순으로 강력
	
		//상수 필드
		int MAX_VOL = 10;  // class에서는 public static 붙이는데 인터페이스는 기본이 public static형임 (상수)
		int MIN_VOL = 0;
		
		//추상 메소드
		void turnOn();    // class에서는 abstract 붙여야하는데 인터페이스는 기본이 abstract임
		void turnOff();
		void setVol(int vol);
	
		//디폴트 메소드
		default void setMute(boolean mute) {    //기본이 abstract라 일반메소드 할려면 default로 일반메소드 추가해야함
				if(mute)
				{
					System.out.println("음소거");
				}
				else
					System.out.println("음소거 해제");
		}
		
		//정적 메소드
		static void ChanBattery() {
			System.out.println("건전지 교환");
			}
		
}
