package java8;

public class Day0709 {

	public static void main(String[] args) {
		//25.5
		int sum = 0;
		double avg = 0;
		
		for(int i = 1; i <= 50; i++)
		{
			sum = sum + i;
		}
			avg = (double)sum / 50;
		
			System.out.println(avg);

	}

}
