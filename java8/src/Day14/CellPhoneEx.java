package Day14;

public class CellPhoneEx {

	public static void main(String[] args) {
		
		DmbCellPhone dc = new DmbCellPhone("������", "���", 10);
		dc.powerOn();							//��
		dc.bell();								//��
		dc.sendVoice("��������");				//��
		dc.receiveVoice("��������");			//��
		dc.sendVoice("��������");				//��
		dc.hangUp();							//��
		
		dc.On();								//��
		dc.setChannel(100);						//��
		dc.setChannel(200);						
		dc.Off();								//��
		dc.powerOff();							//��
		
		System.out.println(dc.channel);
		
		CellPhone cp = new CellPhone();
		cp.powerOn();
//		cp.On();							�θ�� �ڽĲ� ��� ����
	}

}
