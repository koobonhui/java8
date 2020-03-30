package Day12;

public class TV {
	
	String gi;
	int year;
	int in;
	
	TV(String gi, int year, int in) {
		this.gi = gi;
		this.year = year;
		this.in = in;
	}
	
	void show() {
		System.out.println(gi + "에서 만든 " + year + "년형 " + in +"인치 TV");
	}
}
