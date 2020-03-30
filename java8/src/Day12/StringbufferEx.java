package Day12;

public class StringbufferEx {

	public static void main(String[] args) {
			StringBuffer sb = new StringBuffer("Java Programming");
			StringBuffer sb2;
			
			sb2 = sb.insert(5, "JSP "); // 원하는곳에 글자 추가
			System.out.println(sb);
			System.out.println(sb2);
			
			sb.append(" Good ");  //문자열 뒤에 추가
			sb.append('A');
			System.out.println(sb);
			
			sb2.reverse();   // 문자열 반대로
			System.out.println(sb2);
			
			sb.setLength(10);  // 문자열 크기 결정
			System.out.println(sb);
			
	}

}
