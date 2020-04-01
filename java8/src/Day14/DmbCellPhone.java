package Day14;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void On( ) {
		System.out.println("Dmb ÄÒ´Ù");
	}
	
	void Off( ) {
		System.out.println("Dmb ²ö´Ù");
	}
	
	void setChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + " À¸·Î º¯°æ");
	}

}
