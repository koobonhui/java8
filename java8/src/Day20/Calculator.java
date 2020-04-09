package Day20;

public class Calculator {
	
		private int memory;

		public int getMemory() {
			return memory;
		}

		public synchronized void setMemory(int memory) {
			synchronized (this) {            // 동기화 블럭도 만들 수 있음
			
			
			this.memory = memory;
			try {
				Thread.sleep(2000);      // 천분의 1     2000은 2초
			}
			catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}

}
