package Day16;

public class Util {

		public static <T> Box3<T> boxing(T t) {
			Box3<T> box = new Box3<>();
			box.set(t);
			return box;
		}
		
}
