package java8;

public class Day1008 {

	public static void main(String[] args) {
			int[][] arr = new int[][] { {10,20},
										{30,40},
										{50,60} };
										
			System.out.println(arr.length);
			System.out.println(arr[0].length);
			System.out.println(arr[1].length);
			System.out.println(arr[2].length);
			System.out.println();
			
			int[][] arr2 = new int[3][2];
			
			System.out.println(arr2.length);
			System.out.println(arr2[0].length);
			System.out.println(arr2[1].length);
			System.out.println(arr2[2].length);
			System.out.println();
			
			int[][] arr3 = new int[3][];
			arr3[0] = new int[5];
			arr3[1] = new int[3];
			arr3[2] = new int[10];
			
			System.out.println(arr3.length);
			System.out.println(arr3[0].length);
			System.out.println(arr3[1].length);
			System.out.println(arr3[2].length);
			System.out.println();
			
			arr3 = new int[4][];
			System.out.println(arr3.length);
	}

}
