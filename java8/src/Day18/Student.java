package Day18;

public class Student {
	
		private String name;
		private int enScore;
		private int maScore;
		
		public Student(String name, int enScore, int maScore) {
			this.name = name;
			this.enScore = enScore;
			this.maScore = maScore;
		}
		
		public String getName() {
			return name;
		}
		
		public int getEnScore() {
			return enScore;
		}
		
		public int getMaScore() {
			return maScore;
		}

}
