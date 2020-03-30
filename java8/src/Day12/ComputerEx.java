package Day12;

public class ComputerEx {

	public static void main(String[] args) {
		Computer com = new Computer();
		
		int[] arr1 = {10, 20, 30};
		
		int re1 = com.sum(arr1);
		
		System.out.println(re1);
		//									인자
		//                   객체로 만들어서 넣어야함 배열로 만들면
		int re2 = com.sum(new int[] {10, 20, 30, 40, 50});
		System.out.println(re2);
		
		int re3 = com.sum2(arr1);
		System.out.println(re3);
		
		int re4 = com.sum2(new int[] {10, 20, 30, 40, 50});
		System.out.println(re4);
		
		int re5 = com.sum2(10, 20, 30, 40, 50);
		System.out.println(re5);
		
//		int re6 = com.sum(10,20,30);
	}

}
