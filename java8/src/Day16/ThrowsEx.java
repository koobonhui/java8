package Day16;

public class ThrowsEx {
	
	public static void calc1() throws ArithmeticException {         // Ʈ���� ĳġ �ϱ� ���� �� ���� 
		calc2();
	}
	
	public static void calc2() throws ArithmeticException {
		int num = 5/0;
	}

	public static void main(String[] args) {

		System.out.println("���� �˸���");
		
		try
		{
			calc1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("�޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("���α׷� ����");
		}
	}
	
	public static void calc3() throws InterruptedException {  
			Thread.sleep(1000);
		
	}

}
