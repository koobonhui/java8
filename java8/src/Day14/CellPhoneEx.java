package Day14;

public class CellPhoneEx {

	public static void main(String[] args) {
		
		DmbCellPhone dc = new DmbCellPhone("갤럭시", "블루", 10);
		dc.powerOn();							//부
		dc.bell();								//부
		dc.sendVoice("ㅎㅇㅎㅇ");				//부
		dc.receiveVoice("ㅂㄱㅂㄱ");			//부
		dc.sendVoice("ㅇㅋㅇㅋ");				//부
		dc.hangUp();							//부
		
		dc.On();								//자
		dc.setChannel(100);						//자
		dc.setChannel(200);						
		dc.Off();								//자
		dc.powerOff();							//부
		
		System.out.println(dc.channel);
		
		CellPhone cp = new CellPhone();
		cp.powerOn();
//		cp.On();							부모는 자식꺼 사용 못함
	}

}
