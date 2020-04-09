package Day20;

import java.awt.Color;

import javax.swing.JFrame;

public class PolygonEx {

	public static void main(String[] args) {

JFrame f = new JFrame("색상변환");
		
		PolygonJApplet p = new PolygonJApplet();
		
		f.setBackground(Color.GRAY);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}

}
