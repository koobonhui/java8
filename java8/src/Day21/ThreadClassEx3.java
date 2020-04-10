package Day21;

class Account {
	int total = 1000000;
	synchronized void deposit(int amt) {
		if(total - amt < 0) {
			Thread.currentThread().interrupt();
		}
		else {
			total -= amt;
			System.out.println(amt + "���� ����, " + "���� �ܾ� : " + gettot());			
		}
	}
	int gettot() {
		return total;
	}
}

class Customer extends Thread {
	
	Account accl;
	
	public Customer(Account accl) {
		this.accl = accl;
	}
	
	@Override
	public void run() {
		
			for(int i = 0; i < 300; i++) {
				accl.deposit(9800);
				if(interrupted()) {
					break;
				}
			}
		
	}
	
}

public class ThreadClassEx3 {
	public static void main(String[] args) {
		
		Account acc = new Account();
		Customer[] cust = new Customer[4];
		for(int i = 0; i < 4; i++) {
			cust[i] = new Customer(acc);
			cust[i].start();
		}
		for(int i = 0; i < 4; i++) {
			try {
				cust[i].join();
			} catch (InterruptedException e) {			}
		}
		System.out.println("�ܾ� ����, " + "���� �ܾ� : " + acc.gettot() + ", ����ݾ� : 9800");
	}

}
