package java8;

public class Day1012 {

	public static void main(String[] args) {
		int[] arr = new int[1_000_000];
		int sum = 0;
		int sum2 = 0;
		
		long stime1 = System.currentTimeMillis();
		for(int i = 0; i < arr.length; i++)
		{
			sum += i;
		}
		long etime1 = System.currentTimeMillis();
		System.out.println(etime1 - stime1);
		
		System.out.println("====================");
		
		long stime2 = System.currentTimeMillis();
		for(int num : arr)
		{
			sum2 += num;
		}
		long etime2 = System.currentTimeMillis();
		System.out.println(etime2 - stime2);

	}

}
