package Day13;

public class MemberEx {

	public static void main(String[] args) {
		
		MemberService ms = new MemberService();
		Member hong = new Member("홍길동", "hong");
		
		hong.password = "12345";
		hong.age = 30;
		
		if(ms.login(hong.id, hong.password))
		{
			System.out.println("로그인");
			ms.logout(hong.id);
		}
		else
			System.out.println("잘못입력");
		
		Member lee = new Member("이연희", "lee");
		
		lee.password = "12345";
		lee.age = 20;
		
		if(ms.login(lee.id, lee.password))
		{
			System.out.println("로그인");
			ms.logout(lee.id);
		}
		else
			System.out.println("잘못입력");

	}

}
