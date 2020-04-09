package Day20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PolygonJApplet extends JPanel{

		public void paint(Graphics g) {
			int [] x1 = {50, 25, 60, 90, 55};
			int [] y1 = {50, 70, 95, 40, 30};
			int n1 = x1.length;
			
			int [] x2 = {130, 105, 140, 170, 135};
			int [] y2 = {50, 70, 95, 40, 30};
			int n2 = x2.length;
			
			g.setColor(Color.blue);
			g.drawPolygon(x1, y1, n1);
			g.fillPolygon(x2, y2, n2);
		}
}
