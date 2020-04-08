package Day19;

public class ThreadB extends Thread {

		public void run() {
			for(int i = 0; i < 2; i++)
			{
				System.out.println(getName() + "°¡ Ãâ·Â");
			}
		}
}
