package Day20;

public class ThreadA extends Thread {

		public boolean stop = false;
		public boolean work = true;
		
		@Override
		public void run() {
			while(!stop) {
					if(work) {
						System.out.println("ThreadA 내용");
					}
					else {
						Thread.yield();
					}
			}
			System.out.println("ThreadA 종료");
		}
}
