package java8;

public class Day0708 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int j = 10; j >= 1; j--)
		{
			System.out.print(j + " ");
		}
		
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 10; j >= i; j--)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		
		
	}

}
