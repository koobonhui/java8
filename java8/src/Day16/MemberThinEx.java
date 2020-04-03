package Day16;

public class MemberThinEx {   

	public static void main(String[] args) {

		//원본 객체 생성
		MemberThin ori = new MemberThin("blue", "홍길동", "12345", 25, true);
		
		//복제 객체를 얻은 후 패스워드 변경
//		MemberThin clone = ori.getMember();      // 객체를 새로 생성해서 복사하는거라 서로 다름 (깊은복제)
		MemberThin clone = ori;             // 얕은복제
		
		clone.password = "09876";
		
		System.out.println(ori.hashCode());
		System.out.println(clone.hashCode());
		System.out.println();
		
		System.out.println("복제 객체의 필드값");
		System.out.println("id : " + clone.id);
		System.out.println("name : " + clone.name);
		System.out.println("password : " + clone.password);
		System.out.println("age : " + clone.age);
		System.out.println("adult : " + clone.adult);
		
		System.out.println("========================");
		
		System.out.println("원본 객체의 필드값");
		System.out.println("id : " + ori.id);
		System.out.println("name : " + ori.name);
		System.out.println("password : " + ori.password);
		System.out.println("age : " + ori.age);
		System.out.println("adult : " + ori.adult);
	}

}
