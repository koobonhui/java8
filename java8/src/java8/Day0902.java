package java8;

public class Day0902 {

	public static void main(String[] args) {
		for(int i = 1; i <= 25; i++)
		{
			System.out.print(i + " ");
			
			if(i % 5 == 0)
			{
				System.out.println();
			}
				
		}
		
		System.out.println("=============");
		
		int cnt = 1;
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.printf("%02d ", cnt);
				cnt++;
//				printf�� ���Ŀ� �°� ����ϴ� �޼ҵ�
//				c���� ����ϴµ� �ڹٿ����� ��밡��
//				%�� ����
//				d = decimal 10����
//				f = float �Ǽ�
//				lf = long float(double) �Ǽ� �ڹٿ��� ���ܴ�
//				o = octa 8����
//				x = hexa 16����
//				b = binary 2����(�ֳ��𸣰���)
//				s = string ���ڿ�
//				c = char ���� 1�� 
//				
//				����
//				%2d = ������ 2�ڸ� ���, %10d ��� ���ھտ� 0������ ����� 0���� ä�� %02d
//				- ���̸� �������� %-3d
			}
				System.out.println();
		}
		
		System.out.println("=============");
		
		cnt = 1;
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(i % 2 == 0)
				{
					System.out.print(cnt + "\t");
				}
				else
				{
					System.out.print((i+1)*5 - j + "\t");
				}
				cnt++;
			}
			System.out.println();
		}
		
		System.out.println("===========");
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			System.out.print("@");
			System.out.println();
		}
		
		System.out.println("================");
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(i == j)
				{
					System.out.print("@");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
