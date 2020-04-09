package Day20;

import java.util.Map;
import java.util.Set;

public class ThreadInfoEx {

	public static void main(String[] args) {

			AutoSaveThread2 autoSaveThread = new AutoSaveThread2();
			autoSaveThread.setName("AutoSaveThread");
			autoSaveThread.setDaemon(true);
			autoSaveThread.start();
			
			Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
			Set<Thread> threads = map.keySet();
			for(Thread thread : threads) {
				System.out.println("Name : " + thread.getName() + ((thread.isDaemon()) ? "(����)":"(��)"));
				System.out.println("\t" + "�Ҽӱ׷� : " + thread.getThreadGroup().getName());
				System.out.println();
			}
	}

}