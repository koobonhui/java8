package Day19;

import java.util.function.IntPredicate;

public class PridecateAndOrNegateEx {

	public static void main(String[] args) {
		
			// 2의 배수 검사
			IntPredicate predicateA = a -> a%2 == 0;
			
			//3의 배수 검사
			IntPredicate predicateB = a -> a%3 == 0;
			
			IntPredicate predicateAB;
			boolean result;
			
			// and()
			predicateAB = predicateA.and(predicateB);
			result = predicateAB.test(9);
			System.out.println("9는 2와3의 배수냐 : " + result);
			
			// or()
			predicateAB = predicateA.or(predicateB);
			result = predicateAB.test(9);
			System.out.println("9는 2 또는 3의 배수냐 : " + result);
			
			// negate      반대로 바꾸기 true면 false로
			predicateAB = predicateA.negate();
			result = predicateAB.test(9);
			System.out.println("9는 홀수냐? : " + result);
	}

}
