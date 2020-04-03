package Day16;

public class ArrayExceptionEx {
	public static void main(String[] args) {

		Test();
	}
	
	static void Test() {
		
		int[] arr = new int[3];
		try
		{
			arr[2] = 100;					// ���ܰ� �߻��ϸ� �߻��� ���� �ٷ� catch�� �Ѿ�� �Ʒ��� ���� �ȵ�
			System.out.println(arr[2]);     // ���ܰ� �߻��ؾ� ���ܱ����� �ߵ���
			throw new NullPointerException(); // ������ ���� �߻� ��Ű�� ��ü �����ؼ� throw �ϸ� ��	
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)		// catch�� ������ ��밡��      
		{																	// or ��ȣ ����ϸ� ���ÿ� ������ ���� ó�� ����
			System.out.println("���ڿ��� x , ���� �Ѿ");
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("���� �Ѿ");
//		}
		catch(Exception e)    // �� ���� ���� �𸣸� �ֻ����� Exception ȣ���ϸ� ��� ������
		{					  // ��� ���ܸ� ó���ϴ� ���� �������� ����ؾ� ��
			System.err.println("��� ���� ó��");        // err.print �� ����ϸ� ����ó�� ������ �۾��� ����
			e.printStackTrace();   // �߸��� ��� �����ؼ� �������
		}
		finally   			// ���ܿ� ������� ������ �����ϴ� ����
		{					// ���� ����
			System.out.println("finally ����");
		}
		
		try {
			Thread.sleep(1000);               // ����ó�� ���̴� ������ �Ұ����� �ڵ尡 ����
		} catch (InterruptedException e) {    // �׷��� try - catch�� �ʿ���
			e.printStackTrace();
		}
	}
}
