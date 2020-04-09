package Day20;

import java.awt.Color;

import javax.swing.JFrame;

public class ColorEx {

	public static void main(String[] args) {

		JFrame f = new JFrame("색상변환");
		
		ColorJapplet p = new ColorJapplet();
		p.init();
//		f.setTitle("애플릿"); 
		f.setBackground(Color.GRAY);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}

}
