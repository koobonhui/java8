package Day18;

import java.util.function.IntBinaryOperator;

public class OperatorEx {

		private static int[] scores = {92, 95, 97};
		
		public static int maxOrmin(IntBinaryOperator operator) {
			int re = scores[0];
			for(int score : scores)
			{
				re = operator.applyAsInt(re, score);
			}
			return re;
		}
	public static void main(String[] args) {
			
		int max = maxOrmin(
							(a, b) -> { 
			
									if(a >= b) return a;
									else return b;
							}
		);
		System.out.println("최대값 : " + max);
		
		int min = maxOrmin(
				(a, b) -> { 

						if(a <= b) return a;
						else return b;
				}
);
		System.out.println("최소값 : " + min);

	}
}
