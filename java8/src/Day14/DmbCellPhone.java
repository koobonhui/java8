package Day14;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void On( ) {
		System.out.println("Dmb �Ҵ�");
	}
	
	void Off( ) {
		System.out.println("Dmb ����");
	}
	
	void setChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + " ���� ����");
	}

}
