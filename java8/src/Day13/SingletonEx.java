package Day13;

public class SingletonEx {

	public static void main(String[] args) {
			Singleton s;
//			s = new Singleton();  // 생성자 호출은 불가능
			s = Singleton.getInstance(); // 기존에 생성된 객체를 호출
			
			Singleton s1 = Singleton.getInstance();
			
			if(s == s1)
			{
				System.out.println("동일");
			}
			else
				System.out.println("다름");
			
			Member m1 = new Member("홍", "hong");
			Member m2 = new Member("홍", "hong");
			
			if(m1 == m2)
			{
				System.out.println("동일");
			}
			else
				System.out.println("다름");

	}

}
