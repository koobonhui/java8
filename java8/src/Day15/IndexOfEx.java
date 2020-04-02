package Day15;

public class IndexOfEx {

	public static void main(String[] args) {

			String str = "자바 프로그래밍";
			int in = str.indexOf("프로");
			
			System.out.println(in);
			
			in = str.indexOf("C언어");   // 찾는게 없으면 -1 리턴
			
			System.out.println(in);
			
			str = "자바자바자바 프로프로 그래밍이이입니다";
			
			in = str.indexOf("바");  // 매개변수가 한 개일 경우는 0번부터 검색 한다
			
			System.out.println(in);
			
			in = str.indexOf("바", in + 1); // 2번째의 바를 검색할려면 2번부터 검색해야함
											// 첫번재는 검색어, 두번째는 검색 시작 위치
			System.out.println(in);
			
			in = str.indexOf("바", in + 1);
			
			System.out.println(in);
			
			in = str.indexOf("바", in + 1);
			
			System.out.println(in);
			
			String str2 = str.replace("프로프로 ", "프로 ");  // 리플레이스로 원하는 글자로 변경함
			System.out.println(str2);
			String str3 = str.replace("자바", "JAVA");
			System.out.println(str3);
			
	}

}
