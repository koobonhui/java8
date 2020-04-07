package Day18;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> bigconsumer = (t,u) -> System.out.println(t + u);
		bigconsumer.accept("java", "8");
		
		DoubleConsumer doubleconsumer = d -> System.out.println("java" + d);
		doubleconsumer.accept(8.0);
		
		ObjIntConsumer<String> objconsumer = (t, i) -> System.out.println(t + i);
		objconsumer.accept("java", 8);
		
	}

}
