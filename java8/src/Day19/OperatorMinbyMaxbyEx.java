package Day19;

import java.util.function.BinaryOperator;

public class OperatorMinbyMaxbyEx {

	public static void main(String[] args) {

			BinaryOperator<Fruit> binaryOperator;
			Fruit fruit;
			
			binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
			fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
			System.out.println(fruit.name);
			
			// 딸기가 값이 크면 -1 같으면 0 수박이 크면 1 을 반환
			// maxBy니까 1을 반환  
			binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
			fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
			System.out.println(fruit.name);
	}

}
