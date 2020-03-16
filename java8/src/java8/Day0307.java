package java8;

public class Day0307 {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = false;
		
		boolean re = a && b;
		System.out.println(re);
		
		boolean re2 = b && c;
		System.out.println(re2);
		System.out.println(a && c);
		System.out.println(b && d);
		System.out.println("=============");
		System.out.println(a || b);
		System.out.println(b || c);
		System.out.println(a || c);
		System.out.println(b || d);
		System.out.println("=============");
		System.out.println(!a);
		System.out.println(!b);
		System.out.println("=============");
		boolean light = false;
		System.out.println("스탠드의 전구가 켜졌나? " + light);
		light = !light;
		System.out.println("스탠드의 전구가 켜졌나? " + light);
		light = !light;		
		System.out.println("스탠드의 전구가 켜졌나? " + light);
		light = !light;
		System.out.println("스탠드의 전구가 켜졌나? " + light);
	}

}
