package Day15;

public class ReConEx {

	public static void main(String[] args) {
			
			ReControl.ChanBattery();
			
			Tv tv = new Tv();
			Audio audio = new Audio();
//			ReControl rc = new ReControl();  �������̽��� ������ ����
			
			ReControl rc;     //������ ������ �� ����
			
			rc = tv;    // �������̽� �������� ���� Ŭ������ ��ü�� ���Ե�
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
					System.out.println("���Ϸ�Ŵ");
				}

				@Override
				public void turnOff() {
					System.out.println("���Ϸ���");
				}

				@Override
				public void setVol(int vol) {
					System.out.println("�µ� : " + vol);
				}
				
				};             // �������̽��� �͸�����ü�� ���� �� ����
							   // �̻����� �ѹ��� ���� �� ����
							   // ���� ��� �ϴϱ� �˾Ƶα⸦ (���� Ŭ������ �ϳ� ���� ��� �� �ʿ䰡 ���� ��)
				
				
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
