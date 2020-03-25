package java8;

public class Day0902 {

	public static void main(String[] args) {
		for(int i = 1; i <= 25; i++)
		{
			System.out.print(i + " ");
			
			if(i % 5 == 0)
			{
				System.out.println();
			}
				
		}
		
		System.out.println("=============");
		
		int cnt = 1;
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.printf("%02d ", cnt);
				cnt++;
//				printf는 형식에 맞게 출력하는 메소드
//				c언어에서 사용하는데 자바에서도 사용가능
//				%로 시작
//				d = decimal 10진수
//				f = float 실수
//				lf = long float(double) 실수 자바에는 없단다
//				o = octa 8진수
//				x = hexa 16진수
//				b = binary 2진수(있나모르겠음)
//				s = string 문자열
//				c = char 문자 1개 
//				
//				조합
//				%2d = 십진수 2자리 출력, %10d 등등 숫자앞에 0넣으면 빈공간 0으로 채움 %02d
//				- 붙이면 좌측정렬 %-3d
			}
				System.out.println();
		}
		
		System.out.println("=============");
		
		cnt = 1;
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(i % 2 == 0)
				{
					System.out.print(cnt + "\t");
				}
				else
				{
					System.out.print((i+1)*5 - j + "\t");
				}
				cnt++;
			}
			System.out.println();
		}
	}

}
