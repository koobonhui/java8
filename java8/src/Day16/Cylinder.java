package Day16;

public class Cylinder extends Circle {
	
		int height;
		
		Cylinder(int r, int h) {
			super(r);
			this.height = h;
		}
		
		double volume() {
			
			return area() * height;
		}
		
		String showCylender() {
			return showCircle() + ", Height : " + height;
		}
}
