package Day12;

public class Carre {
	
	//�ʵ�
		int gas;
		
	//�޼ҵ�	
		void setGas(int gas) {
			this.gas = gas;
		}
		
		boolean isleftGas() {
			if (gas == 0)
			{
				System.out.println("Gas�� ����");
				return false;
			}
			System.out.println("Gas�� �ִ�");
			return true;
		}
		
		void run() {
			while(true)
			{
				if(gas > 0)
				{
					System.out.println("�޸���. ���� �ܷ� : " + gas);
					gas -= 1;
				}
				else
				{
					System.out.println("�����. ���� �ܷ� : " + gas);
					return; // �޼ҵ带 ���߰� �ϴ� ��� ����
				}
			}
		}
}
