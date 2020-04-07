package Day18;

public class UsingThisEx {

	public static void main(String[] args) {
		UsingThis using = new UsingThis();
		UsingThis.Inner inner = using.new Inner();
		inner.method();
	}

}
