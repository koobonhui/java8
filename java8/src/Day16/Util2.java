package Day16;

public class Util2 {
		
		// 상위 클래스를 제한 Number보다 높은거 못씀
		public static <T extends Number> int compare(T t1, T t2) {   //extends는 최상위 클래스를 설정
//			Double d1;    // Ctrl + t 누르면 상위 하위가 누군지 보여줌
			
			double v1 = t1.doubleValue();
//			System.out.println(t1.getClass().getName());
			double v2 = t2.doubleValue();
//			System.out.println(t2.getClass().getName());
			return Double.compare(v1, v2);                // compare에 컨트롤 누르면 뭔지 알려줌
			
//			if (d1 < d2)
//	            return -1;           // compare가 뭔가?
//	        if (d1 > d2)
//	            return 1; 
//			   (d1 == d2)                  
//			    return 0;
		}
}
