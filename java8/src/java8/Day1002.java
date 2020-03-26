package java8;

public class Day1002 {

	public static void main(String[] args) {
		int s0 = 10;
		int s1 = 20;
		int s2 = 30;
		int s3 = 40;
		int s4 = 50;
		int[] stu = {10, 20, 30 ,40 ,50};
		
		int res = s0 + s1 + s2 + s3 + s4;
		
		System.out.println(res);
		
		int re2 = 0;
		for(int i = 0; i < 5; i++)
		{
			re2 += stu[i];
		}
		System.out.println(re2);
	}

}
