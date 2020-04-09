package Day20;

public class DaeminEx {

	public static void main(String[] args) {

			AutoSaveThread autoSaveThread = new AutoSaveThread();
			autoSaveThread.setDaemon(true);    // 데몬스레드는 메인스레드가 종료되면 같이 종료함
			autoSaveThread.start();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			System.out.println("메인스레드종료");
	}

}
