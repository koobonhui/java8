package Day12;

public class Block {
		static String compa = "삼성";
		static String kind = "LCD";
		static String pro = compa + "-" + kind;
		static String pro2;
		
		
		// 스테틱이 옛날에는 바로 계산 안되서 스테틱 블럭을 만들어서 거기서 계산해야함
		static {
			pro2 = compa + "-" + kind;
		}
		
}
