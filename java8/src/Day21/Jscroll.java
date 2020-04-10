package Day21;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Jscroll extends JFrame {
	
		JPanel jp;
		public Jscroll(String title) {
			super(title);
			setLayout(new BorderLayout());
			jp = new JPanel();
			jp.setLayout(new GridLayout(10, 5));
			int cnt = 1;
			for(int i = 1; i <= 10; i++) {
				for(int j = 1; j <= 5; j++) {
					jp.add(new JButton("버튼" + cnt));
					cnt++;
				}
			}
			int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
			int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
			JScrollPane js = new JScrollPane(jp, v ,h);
			add(js, BorderLayout.CENTER);
			
			
			setSize(500, 200);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public static void main(String[] args) {
			Jscroll f = new Jscroll("스크롤");
		}
		
}


