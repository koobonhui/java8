package Day21;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JpanelEx {
	public static void main(String[] args) {
	
			JFrame f = new JFrame();
			JPanel p1 = new JPanel();
			JPanel p2 = new JPanel();
			
			p2.add(new JButton("버튼1"));
			p2.add(new JButton("버튼2"));
			p2.add(new JButton("버튼3"));
			
			p1.add(p2);
			f.add(p2);
			
			f.pack();
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

