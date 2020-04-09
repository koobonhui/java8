package Day20;

	class Account {
		private int tot = 0;
		synchronized void deposit(int amt) {
			tot += amt;
		}
		int gettot() {
			return tot;
		}
	}
	
	class Customer extends Thread {
		Account accl;

		public Customer(Account accl) {
			this.accl = accl;
		}
		
		@Override
		public void run() {
			try {
				for(int i = 0; i < 300; i++) {
					System.out.println("스레드 " + getName() + " : " + i + " 번째");
					accl.deposit(10000);
					sleep(50);
					if(accl.gettot() >= 1000000)
						break;
				}
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
public class ContributionEx {
	public static void main(String[] args) {

			Account acc = new Account();
			Customer cust[] = new Customer[10];
			for(int i = 0; i < 10; i++) {
				cust[i] = new Customer(acc);
				cust[i].start();
			}
			for(int i = 0; i < 10; i++) {
				try {
					cust[i].join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("총액 : " + acc.gettot());
	}

}
