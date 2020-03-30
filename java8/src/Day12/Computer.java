package Day12;

public class Computer {
	
//		int sum(int x, int y, int z) {
//			return x + y + z;
//		}
		
		int sum(int[] arr) {
			int sum = 0;
			for(int i = 0; i < arr.length; i++)
			{
				sum += arr[i];
			}
			return sum;
		}
		//			 인수
		int sum2(int...arr) {   // 가변형 인자는 배열로 자동으로 변환됨 
			int sum = 0;
			for(int i = 0; i < arr.length; i++)
			{
				sum += arr[i];
			}
			return sum;
		}
}
