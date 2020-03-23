package java8;

public class Day0710 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++)
		{
			if((i % 3 == 0 && i % 5 == 0))
			{
				System.out.println(i + " Ping Pong");
			}
			else if(i % 3 == 0)
			{
				System.out.println(i + " Ping");
			}
			else if(i % 5 == 0)
			{
				System.out.println(i + " Pong");
			}
			else
			{
				System.out.println(i);
			}
			
			for(int j = 1; j <= 100; j++)
			{
				System.out.print(j + " ");
				if(j % 3 == 0)
				{
					System.out.print("ping");
				}
				if(j % 5 == 0)
				{
					System.out.print("pong");
				}
				System.out.println();
			}
		}

	}

}
