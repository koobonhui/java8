package Day20;

public class Calculator {
	
		private int memory;

		public int getMemory() {
			return memory;
		}

		public synchronized void setMemory(int memory) {
			synchronized (this) {            // ����ȭ ���� ���� �� ����
			
			
			this.memory = memory;
			try {
				Thread.sleep(2000);      // õ���� 1     2000�� 2��
			}
			catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}

}
