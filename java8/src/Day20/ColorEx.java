package Day20;

import java.awt.Color;

import javax.swing.JFrame;

public class ColorEx {

	public static void main(String[] args) {

		JFrame f = new JFrame("����ȯ");
		
		ColorJapplet p = new ColorJapplet();
		p.init();
//		f.setTitle("���ø�"); 
		f.setBackground(Color.GRAY);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}

}
