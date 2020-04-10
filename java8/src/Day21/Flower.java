package Day21;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Flower extends JPanel {

	public void init() {
		
		setBackground(Color.white);
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.red);
		g.fillOval(50, 50, 100, 100);
		
		g.setColor(Color.yellow);
		g.fillOval(75, 75, 50, 50);
		
		g.setColor(Color.green);
		g.fillRect(95, 151, 10, 30);
		
		g.setColor(Color.pink);
		g.fillArc(65, 151, 30, 30, 135, 180);
		
		g.setColor(Color.pink);
		g.fillArc(105, 151, 30, 30, 225, 180);
	// ----------------------------------------------	
		g.setColor(Color.red);
		g.fillOval(250, 250, 100, 100);
		
		g.setColor(Color.yellow);
		g.fillOval(275, 275, 50, 50);
		
		g.setColor(Color.green);
		g.fillRect(295, 351, 10, 30);
		
		g.setColor(Color.pink);
		g.fillArc(270, 351, 30, 30, 135, 180);
		
		g.setColor(Color.pink);
		g.fillArc(298, 351, 30, 30, 225, 180);
	}
}
