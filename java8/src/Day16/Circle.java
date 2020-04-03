package Day16;

public class Circle {
	
		static final double pi = 3.14;
		int num;
		
		Circle(int num) {
			this.num = num;
		}
		double area() {
			return pi * num * num;
		}
		
		String showCircle() {
			return "Ra : " + num;
		}
}
