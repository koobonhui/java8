package Day12;

public class Computer {
	
//		int sum(int x, int y, int z) {
//			return x + y + z;
//		}
		
		int sum(int[] arr) {
			int sum = 0;
			for(int i = 0; i < arr.length; i++)
			{
				sum += arr[i];
			}
			return sum;
		}
		//			 �μ�
		int sum2(int...arr) {   // ������ ���ڴ� �迭�� �ڵ����� ��ȯ�� 
			int sum = 0;
			for(int i = 0; i < arr.length; i++)
			{
				sum += arr[i];
			}
			return sum;
		}
}
