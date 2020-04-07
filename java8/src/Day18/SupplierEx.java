package Day18;

import java.util.function.IntSupplier;

public class SupplierEx {

	public static void main(String[] args) {
		
		IntSupplier intsupplier = () -> {
			int num = (int)(Math.random() * 6) + 1;
			return num;
		};
		
		int num = intsupplier.getAsInt();
		System.out.println("´«ÀÇ ¼ö : " + num);
		
	}

}
