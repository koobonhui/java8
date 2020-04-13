package Day22;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("메뉴 예");
		JMenuBar bar = new JMenuBar();
		
		JMenu bar1 = new JMenu("파일");
		JMenu bar2 = new JMenu("편집");
		JMenu bar3 = new JMenu("보기");
		
		JMenuItem item1 = new JMenuItem("새로만들기");
		JMenuItem item2 = new JMenuItem("열기");
		JMenuItem item3 = new JMenuItem("저장");
		
		bar1.add(item1);
		bar1.add(item2);
		bar1.add(item3);
		
		JMenuItem item4 = new JMenuItem("잘라내기");
		JMenuItem item5 = new JMenuItem("복사");
		JMenuItem item6 = new JMenuItem("붙여넣기");
		
		bar2.add(item4);
		bar2.add(item5);
		bar2.add(item6);
		
		JMenuItem item7 = new JMenuItem("도구모음");
		JMenuItem item8 = new JMenuItem("상태표시줄");
		
		bar3.add(item7);
		bar3.add(item8);
		
		bar.add(bar1);
		bar.add(bar2);
		bar.add(bar3);
		
		TextField tf = new TextField();
		tf.setEnabled(false); //사용할수있냐없냐
		tf.setEditable(false); // 고칠수잇냐
		
		f.add(tf, BorderLayout.SOUTH);
		f.setJMenuBar(bar);
		f.setSize(300, 200);
		f.setVisible(true);
		
		ActionListener al = e -> tf.setText(e.getActionCommand());
		item1.addActionListener(al);
		item2.addActionListener(al);
		item3.addActionListener(al);
		item4.addActionListener(al);
		item5.addActionListener(al);
		item6.addActionListener(al);
		item7.addActionListener(al);
		item8.addActionListener(al);
				
	}
}
