package Day20;

import javax.swing.JFrame;

public class ParamEx {

	public static void main(String[] args) {

			JFrame f = new JFrame("¾ÖÇÃ¸´");
			
			ParamJApplet p = new ParamJApplet();
			p.init("Java");
			
//			f.setTitle("¾ÖÇÃ¸´");     
			f.setSize(3100, 3100);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.add(p);
			f.setVisible(true);
	}

}
