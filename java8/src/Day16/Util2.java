package Day16;

public class Util2 {
		
		// ���� Ŭ������ ���� Number���� ������ ����
		public static <T extends Number> int compare(T t1, T t2) {   //extends�� �ֻ��� Ŭ������ ����
//			Double d1;    // Ctrl + t ������ ���� ������ ������ ������
			
			double v1 = t1.doubleValue();
//			System.out.println(t1.getClass().getName());
			double v2 = t2.doubleValue();
//			System.out.println(t2.getClass().getName());
			return Double.compare(v1, v2);                // compare�� ��Ʈ�� ������ ���� �˷���
			
//			if (d1 < d2)
//	            return -1;           // compare�� ����?
//	        if (d1 > d2)
//	            return 1; 
//			   (d1 == d2)                  
//			    return 0;
		}
}
