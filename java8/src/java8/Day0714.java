package java8;

public class Day0714 {

	public static void main(String[] args) {
		
		int sum = 0;
		int count =0;
		//5의 배수 합
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
		
		//3의 배수 출력
		for(int i = 1; i <= 50; i++)
		{
			if(i % 3 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//3의 배수 총 합, 개수를 출력
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
