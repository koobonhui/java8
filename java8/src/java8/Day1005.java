package java8;

public class Day1005 {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		int[] arr2 = {0,0,0,0,0};
		int[] arr3 = new int[5];
		
		for(int i = 0; i < arr3.length; i++)
		{
			System.out.println(arr3[i]);
		}
		
		boolean[] arr4 = new boolean[5];
		
		for(int i = 0; i < arr4.length; i++)
		{
			System.out.println(arr4[i]);
		}
		
		String[] arr5 = new String[5];
		
		for(int i = 0; i < arr5.length; i++)
		{
			System.out.println(arr5[i]);
		}
		
//		arr3 = {10, 20, 30, 40}; 중괄호 초기화는 최초만 가능
		arr3[0] = 10;
		arr3[1] = 20;
		arr3[2] = 30;
		arr3[3] = 40;
		arr3[4] = 50;
	}

}
