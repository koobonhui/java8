package Day20;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JPanel;

public class ColorJapplet extends JPanel {

		public void init() {
			setBackground(Color.orange);
//			�гλ��
//			Panel p1 = new Panel();
//			p1.setBackground(Color.orange);
//			this.add(p1);
		}
		
		public void paint(Graphics g) {
			// paint �޼ҵ忡�� fillrect ���
//			g.setColor(Color.orange);
//			g.fillRect(0, 0, getWidth(), getHeight());
			
			Color myColor = new Color(255, 0, 0);
			g.setColor(myColor);
			g.drawString("������", 40, 100);
		}
}
