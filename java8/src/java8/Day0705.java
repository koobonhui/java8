package java8;

public class Day0705 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 50; i ++)
		{
			if(i % 3 != 0)
				continue;
			sum = sum + i;
		}
		
		
		System.out.println(sum);

	}

}
