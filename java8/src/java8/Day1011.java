package java8;

import java.util.Arrays;

public class Day1011 {

	public static void main(String[] args) {
			int num = 10;
			int num2 = num;
			
			System.out.println(num2);
			
			int[] arr1 = {10, 20, 30};
			int[] arr2 = arr1;
			
			for(int i = 0; i < arr2.length; i++)
			{
				System.out.println(arr2[i]);
			}
			System.out.println("================");
			
			int[] arr3 = new int[5];
			System.arraycopy(arr1, 1, arr3, 3, 2);
			for(int i = 0; i < arr3.length; i++)
			{
				System.out.println(arr3[i]);
			}
			System.out.println("=============");
			int[] arr4 = Arrays.copyOf(arr1, arr1.length);
			for(int i = 0; i < arr4.length; i++)
			{
				System.out.println(arr4[i]);
			}
			
	}

}
