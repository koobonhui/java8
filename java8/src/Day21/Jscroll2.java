package Day21;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Jscroll2 extends JFrame {
	
		JPanel jp;
		public Jscroll2(String title) {
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
			
			JMenuBar jm = new JMenuBar();
			setJMenuBar(jm);
			JMenu jm1 = new JMenu("파일");
			JMenu jm2 = new JMenu("편집", false);
			JMenu jm3 = new JMenu("보기", true);
			JMenuItem i1 = new JMenuItem("새로만들기");
			JMenuItem i2 = new JMenuItem("열기");
			JMenuItem i3 = new JMenuItem("종료");
			jm1.add(i1);
			jm1.add(i2);
			jm1.add(i3);
			jm.add(jm1);
			jm.add(jm2);
			jm.add(jm3);
			i3.addActionListener(e -> {
				System.exit(0);
			});
			
			setSize(500, 200);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public static void main(String[] args) {
			Jscroll2 f = new Jscroll2("스크롤");
		}
		
}


