package Day16;

public class ArrayExceptionEx {
	public static void main(String[] args) {

		Test();
	}
	
	static void Test() {
		
		int[] arr = new int[3];
		try
		{
			arr[2] = 100;					// 예외가 발생하면 발생한 줄이 바로 catch로 넘어가서 아랫줄 실행 안됨
			System.out.println(arr[2]);     // 예외가 발생해야 예외구문이 발동함
			throw new NullPointerException(); // 강제로 예외 발생 시키기 객체 생성해서 throw 하면 됨	
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)		// catch는 여러개 사용가능      
		{																	// or 기호 사용하면 동시에 여러개 예외 처리 가능
			System.out.println("숫자연산 x , 범위 넘어감");
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("범위 넘어감");
//		}
		catch(Exception e)    // 뭔 오류 올지 모르면 최상위인 Exception 호출하면 사용 가능함
		{					  // 모든 예외를 처리하니 가장 마지막에 사용해야 함
			System.err.println("모든 예외 처리");        // err.print 로 출력하면 에러처럼 빨간색 글씨로 나옴
			e.printStackTrace();   // 잘못된 경로 추적해서 출력해줌
		}
		finally   			// 예외와 상관없이 무조건 실행하는 구간
		{					// 생략 가능
			System.out.println("finally 구간");
		}
		
		try {
			Thread.sleep(1000);               // 예외처리 없이는 실행이 불가능한 코드가 있음
		} catch (InterruptedException e) {    // 그래서 try - catch가 필요함
			e.printStackTrace();
		}
	}
}
