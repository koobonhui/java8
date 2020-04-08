package Day19;

public class ThreadNameEx {

	public static void main(String[] args) {

			Thread mainThread = Thread.currentThread();
			System.out.println("시작 "+mainThread.getName());
			
			ThreadA threadA = new ThreadA();
			System.out.println("작업 "+threadA.getName());
			threadA.start();
			
			ThreadB threadB = new ThreadB();
			System.out.println("작업 "+threadB.getName());
			threadB.start();
	}

}
