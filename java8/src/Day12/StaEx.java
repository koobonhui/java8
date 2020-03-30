package Day12;

public class StaEx {

	public static void main(String[] args) {
		
		double re1 = 10 * 10 * Sta.pi;
		int re2 = Sta.plus(10, 5);
		int re3 = Sta.min(10, 5);
		
		Sta st = new Sta(); // static 붙이면 이거 안써도 호출 됨
							
		System.out.println(re1);
		System.out.println(re2);
		System.out.println(re3);
		
		System.out.println(Sta.num);
		Sta.num = 100;
		System.out.println(Sta.num);
		
		System.out.println(st.num);

	}

}
