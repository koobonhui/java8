package java8;

public class Day1006 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = new int[] {10, 20, 30, 40, 50};
		
		String str1 = "ㅎㅇ";
		str1 = "ㅂㅇ";
		
		arr2 = new int[] {100, 200, 300, 400, 500};
		
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		arr2 = new int[10]; //다른 객체로 변환이 가능
		
		System.out.println(str1.length());

	}

}
