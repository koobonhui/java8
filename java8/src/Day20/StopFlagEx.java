package Day20;

public class StopFlagEx {

	public static void main(String[] args) {

			PrintThread printThread = new PrintThread();
			printThread.start();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
			printThread.setStop(true);
	}

}
