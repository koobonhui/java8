package java8;

public class Day1007 {

	public static void main(String[] args) {
		int[][] arr = { {10,20},
					    {30,40},
					    {50,60} }; // 3,2

		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		System.out.println(arr[1][0]);
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		
		int[][] arr2 = {
						{10,20,30},
						{40},
						{50,60,70}
					   };
		
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr2[i].length; j++)
			{
				System.out.println(arr2[i][j]);
			}
		}
		
	}

}
