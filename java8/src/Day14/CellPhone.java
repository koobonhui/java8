package Day14;

public class CellPhone {
	
	String model = "";
	String color = "";
	
	void powerOn() {
		System.out.println("���� on");
	}
	
	void powerOff() {
		System.out.println("���� off");
	}
	
	void bell() {
		System.out.println("Bell~~~~");
	}
	
	void sendVoice(String message) {
		System.out.println("�ڱ� : " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("���� : " + message);
	}
	
	void hangUp() {
		System.out.println("��ȭ ����");
	}

}
