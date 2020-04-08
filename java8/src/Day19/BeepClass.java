package Day19;

import java.awt.Toolkit;

public class BeepClass {
	public static void main(String[] args) {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		System.out.println(Thread.currentThread().getName());
		
	
		Thread t1 = new Thread(new Runnable() {  //익명구현객체
			
			@Override
			public void run() {            
				for(int i = 0; i < 5; i++)
				{
					tk.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
			}
		});
		
			t1 = new Thread(() -> {             // 람다식
				for(int i = 0; i < 5; i++)
				{
					System.out.println("t1 스레드명 : " + Thread.currentThread().getName());
					tk.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
				
			});
			t1.start();     // 스레드는 start 해줘야 실행됨
				
			for(int i = 0; i < 5; i++) {
				System.out.println("경고");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		
	}
}
