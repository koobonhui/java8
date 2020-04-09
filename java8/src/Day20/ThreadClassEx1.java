package Day20;

public class ThreadClassEx1 extends Thread {
	
		int delay;

		public ThreadClassEx1(String name, int delay) {
			super(name);
			this.delay = delay;
		}
		
		@Override
		public void run() {
			try {
				while(true) {
					System.out.println(getName() + " ");
					Thread.sleep(delay);
				}
			} catch (InterruptedException e) {
				System.out.println("error");
				return;
			}
		}
		
		public static void main(String[] args) {
			ThreadClassEx1 t1 = new ThreadClassEx1("쓰레드1", 500);
			ThreadClassEx1 t2 = new ThreadClassEx1("쓰레드2", 700);
			
			t1.start();
			t2.start();
		}
		
		

}
