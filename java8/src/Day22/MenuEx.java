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
		JFrame f = new JFrame("�޴� ��");
		JMenuBar bar = new JMenuBar();
		
		JMenu bar1 = new JMenu("����");
		JMenu bar2 = new JMenu("����");
		JMenu bar3 = new JMenu("����");
		
		JMenuItem item1 = new JMenuItem("���θ����");
		JMenuItem item2 = new JMenuItem("����");
		JMenuItem item3 = new JMenuItem("����");
		
		bar1.add(item1);
		bar1.add(item2);
		bar1.add(item3);
		
		JMenuItem item4 = new JMenuItem("�߶󳻱�");
		JMenuItem item5 = new JMenuItem("����");
		JMenuItem item6 = new JMenuItem("�ٿ��ֱ�");
		
		bar2.add(item4);
		bar2.add(item5);
		bar2.add(item6);
		
		JMenuItem item7 = new JMenuItem("��������");
		JMenuItem item8 = new JMenuItem("����ǥ����");
		
		bar3.add(item7);
		bar3.add(item8);
		
		bar.add(bar1);
		bar.add(bar2);
		bar.add(bar3);
		
		TextField tf = new TextField();
		tf.setEnabled(false); //����Ҽ��ֳľ���
		tf.setEditable(false); // ��ĥ���ճ�
		
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
