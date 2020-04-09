package Day20;

public class TargetThread extends Thread {

		@Override
		public void run() {
			String sum = "";
			for(long i = 0; i < 30000; i++) {
				sum += i;
			}
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {}
			
			sum = "";
			for(long i = 0; i < 30000; i++) {
				sum += i;
			}
		}
		
		public static void main(String[] args) {
			StatePrintThread spt = new StatePrintThread(new TargetThread());
			spt.start();
		}
}
