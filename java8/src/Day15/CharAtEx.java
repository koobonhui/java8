package Day15;

public class CharAtEx {

	public static void main(String[] args) {
		
			String str = "Hello, world!!!";
			
			char ch = str.charAt(4);              //charAt ���ϴ� ���� ��ġ�� char������ ���� �ϳ��� ��� �޴� �� 
			System.out.println(ch);
			
			for(int i = 0; i < str.length(); i++)
				System.out.print(str.charAt(i));
	}

}
