package Day15;

public interface ReControl {   // �������̽��� �޼ҵ�� �⺻������ public
							   // ������ �� �� �� ���Ѱɷ� ���� �� �� ����
							   // public < protected < default < private ������ ����
	
		//��� �ʵ�
		int MAX_VOL = 10;  // class������ public static ���̴µ� �������̽��� �⺻�� public static���� (���)
		int MIN_VOL = 0;
		
		//�߻� �޼ҵ�
		void turnOn();    // class������ abstract �ٿ����ϴµ� �������̽��� �⺻�� abstract��
		void turnOff();
		void setVol(int vol);
	
		//����Ʈ �޼ҵ�
		default void setMute(boolean mute) {    //�⺻�� abstract�� �Ϲݸ޼ҵ� �ҷ��� default�� �Ϲݸ޼ҵ� �߰��ؾ���
				if(mute)
				{
					System.out.println("���Ұ�");
				}
				else
					System.out.println("���Ұ� ����");
		}
		
		//���� �޼ҵ�
		static void ChanBattery() {
			System.out.println("������ ��ȯ");
			}
		
}
