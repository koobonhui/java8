package Day19;

public class StackEx {

	public static void main(String[] args) {

			Stack<String> ss = new Stack<String>(); // String 타입의 Stack생성
			
			ss.push("apple");
			ss.push("banana");
			ss.push("orange");
			
			System.out.println(ss.pop());
			System.out.println(ss.pop());
			System.out.println(ss.pop());
			
			Stack<Integer> is = new Stack<Integer>(); // Integer 타입의 Stack생성
			
			is.push(3);
			is.push(9);
			is.push(7);
			
			System.out.println(is.pop());
			System.out.println(is.pop());
			System.out.println(is.pop());
			
	}

}
