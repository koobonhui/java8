package Day20;

public class PriorityEx {

	public static void main(String[] args) {

			//  Thread �켱����
			for(int i = 1; i <= 10; i++) {
				Thread thread = new CalcThread("thread" + i);
				
				if(i != 10) {
					thread.setPriority(Thread.MIN_PRIORITY);  // �ּҿ켱���� 1������
				}
				else {
					thread.setPriority(Thread.MAX_PRIORITY);  // �ִ�켱���� 10�� ����
				}
				thread.start();
			}
	}

}
