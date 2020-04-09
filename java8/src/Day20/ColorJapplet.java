package Day20;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JPanel;

public class ColorJapplet extends JPanel {

		public void init() {
			setBackground(Color.orange);
//			패널사용
//			Panel p1 = new Panel();
//			p1.setBackground(Color.orange);
//			this.add(p1);
		}
		
		public void paint(Graphics g) {
			// paint 메소드에서 fillrect 사용
//			g.setColor(Color.orange);
//			g.fillRect(0, 0, getWidth(), getHeight());
			
			Color myColor = new Color(255, 0, 0);
			g.setColor(myColor);
			g.drawString("검정색", 40, 100);
		}
}
