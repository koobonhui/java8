package Day15;

public class IpTv implements ReControl, Internet {

	// �̰͵� ���� ������ ������, ���߻���� ������ ó�� ���� �޼ҵ尡 ��� �ִٸ� ������
	// �׷��� �������̽� ���� �޼ҵ� �Ȱ�ġ�� �� ��������
	private int vol;
	
	@Override
	public void searchWeb() {
		System.out.println("���ͳ� �˻�");
	}

	@Override
	public void turnOn() {
		System.out.println("��");
	}

	@Override
	public void turnOff() {
		System.out.println("��");
	}

	@Override
	public void setVol(int vol) {
		this.vol = vol;
		System.out.println(this.vol + " �� ����");
	}
	
		
}
