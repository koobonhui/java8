package java8;

public class Day0714 {

	public static void main(String[] args) {
		
		int sum = 0;
		int count =0;
		//5�� ��� ��
		for(int i = 1; i <= 100; i++)
		{
			if(i % 5 == 0)
			{
				sum = sum + i;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
		
		//3�� ��� ���
		for(int i = 1; i <= 50; i++)
		{
			if(i % 3 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//3�� ��� �� ��, ������ ���
		sum = 0;
		count = 0;
		for(int i = 1; i <= 50; i++)
		{
			if(i % 3 == 0)
			{
				sum = sum + i;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);

	}

}
