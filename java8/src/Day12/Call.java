package Day12;

public class Call {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		Call cv = new Call();
		int re = cv.plus(n1, n2);
		System.out.println(re);
		System.out.println(n1 + n2);
		
		System.out.println("============");
		
		int[] arr = {10, 20, 30, 40, 50};
		int re2 = cv.sum(arr);
		System.out.println(re2);
		int sum = 0;
		for(int n : arr)
		{
			sum += n;
		}
		System.out.println(sum);
	
	}
	
	int plus(int x, int y) {  //Call by value    그 값을 복사해서 원본은 안바뀜
		x += 10;
		y += 10;
		return x + y;
	}
	
	int sum(int[] arr) {    // Call by reference 그 주소를 가져가기때문에 원본도 바뀜
		arr[2] = 330;
		int sum = 0;
		for(int n : arr)
		{
			sum += n;
		}
		return sum;
	}
}
