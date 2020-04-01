package Day14;

public class CellPhone {
	
	String model = "";
	String color = "";
	
	void powerOn() {
		System.out.println("전원 on");
	}
	
	void powerOff() {
		System.out.println("전원 off");
	}
	
	void bell() {
		System.out.println("Bell~~~~");
	}
	
	void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	
	void hangUp() {
		System.out.println("전화 끊기");
	}

}
