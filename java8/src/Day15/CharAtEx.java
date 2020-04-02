package Day15;

public class CharAtEx {

	public static void main(String[] args) {
		
			String str = "Hello, world!!!";
			
			char ch = str.charAt(4);              //charAt 원하는 문자 위치를 char형으로 문자 하나를 출력 받는 것 
			System.out.println(ch);
			
			for(int i = 0; i < str.length(); i++)
				System.out.print(str.charAt(i));
	}

}
