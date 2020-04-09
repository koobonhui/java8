package Day20;

public class PriorityEx {

	public static void main(String[] args) {

			//  Thread 우선순위
			for(int i = 1; i <= 10; i++) {
				Thread thread = new CalcThread("thread" + i);
				
				if(i != 10) {
					thread.setPriority(Thread.MIN_PRIORITY);  // 최소우선순위 1값가짐
				}
				else {
					thread.setPriority(Thread.MAX_PRIORITY);  // 최대우선순위 10값 가짐
				}
				thread.start();
			}
	}

}
