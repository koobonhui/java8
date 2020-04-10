package Day21;

import java.awt.Color;

import javax.swing.JFrame;

public class FlowerEx {

	public static void main(String[] args) {

		JFrame f = new JFrame("색상변환");
		
		Flower p = new Flower();
		
		f.add(p);
		f.setSize(500, 500);
		f.setBackground(Color.GRAY);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setVisible(true);
	}

}
