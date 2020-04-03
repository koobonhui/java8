package Day16;

public class Key {

		public int number;
		String gender;
		
		public Key(int number) {
			this.number = number;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Key)
			{
				Key compareKey = (Key)obj;
				if(this.number == compareKey.number)    // number 대신 gender 할 수도 있음 값을 비교하는거임
				{
					return true;
				}
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			return number;
		}
		
		@Override
		public String toString() {
			return "key 객체에 저장된 넘버 : " + number;
		}
}
