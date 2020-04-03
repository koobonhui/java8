package Day16;

public class ProductEx {

	public static void main(String[] args) {
		
		Product<Tv1, String> p1 = new Product<>();
		p1.setKind(new Tv1());
		p1.setModel("»ï¼ºÆÄºê");
		System.out.println(p1.getModel());
		System.out.println(p1.getKind());
		
		Product<Car1, Integer> p2 = new Product<>();
		p2.setKind(new Car1());
		p2.setModel(new Integer(30));
	}

}
