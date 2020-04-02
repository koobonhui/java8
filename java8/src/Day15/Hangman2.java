package Day15;

public class Hangman2 extends Hangman{
	
		static String[] arr = {"hello", "school", "game", "banana"};
		static String sol = arr[(int)(Math.random() * arr.length)];
		
		public Hangman2() {
			super(sol);
		}
}
