package Day20;

public class DaeminEx {

	public static void main(String[] args) {

			AutoSaveThread autoSaveThread = new AutoSaveThread();
			autoSaveThread.setDaemon(true);    // ���󽺷���� ���ν����尡 ����Ǹ� ���� ������
			autoSaveThread.start();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			System.out.println("���ν���������");
	}

}
