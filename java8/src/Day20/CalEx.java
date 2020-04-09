package Day20;

public class CalEx {

	public static void main(String[] args) { // 스레드 동기화
												
			Calculator cal = new Calculator();
			User1 user1 = new User1();
			User2 user2 = new User2();
			
			user1.setCalculator(cal);      // user1이 100넣고 2초 쉬는 동안 user2가 50넣고 2초 쉼
			user2.setCalculator(cal);	   // 그 때 user1이 깨면 값이 100에서 50으로 바껴있어서 둘다 50 출력
			user1.start();
			user2.start();
	}

}
