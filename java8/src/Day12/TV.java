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
		System.out.println(gi + "���� ���� " + year + "���� " + in +"��ġ TV");
	}
}
