package Day16;

public class MemberThin implements Cloneable {          // 복제하려면 Cloneable 인터페이스를 구현해야 한다.

		public String id;
		public String name;
		public String password;
		public int age;
		public boolean adult;
		
		public MemberThin(String id, String name, String password, int age, boolean adult) {
			
			this.id = id;
			this.name = name;
			this.password = password;
			this.age = age;
			this.adult = adult;
		}
		
		public MemberThin getMember() {
			
			MemberThin cloned = null;
			
			try
			{
				cloned = (MemberThin) clone();  // clone 메소드의 리턴 타입은 오브젝트라서 캐스팅함
			}
			catch(CloneNotSupportedException e)
			{
				e.printStackTrace();
			}
			return cloned;
		}
}
