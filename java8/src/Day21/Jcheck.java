package Day21;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Jcheck extends JFrame {

		JCheckBox jcb1, jcb2, jcb3;
		JRadioButton j1, j2, j3, j4, j5;
		JPanel jp1, jp2, jp3;
		
		Jcheck() {
			super("button");
			
			jp1 = new JPanel();
			jcb1 = new JCheckBox("����", true);
			jcb2 = new JCheckBox("���", true);
			jcb3 = new JCheckBox("����", false);
			
			jp1.add(jcb1);
			jp1.add(jcb2);
			jp1.add(jcb3);
			add(jp1,"North");
			//��ȥ
			jp2 = new JPanel();
			j1 = new JRadioButton("��ȥ", true);
			j2 = new JRadioButton("��ȥ", false);
			ButtonGroup b1 = new ButtonGroup();
			b1.add(j1);
			b1.add(j2);
			jp2.add(j1);
			jp2.add(j2);
			add(jp2, "Center");
			//�ְ�
			jp3 = new JPanel();
			j3 = new JRadioButton("�ڰ�", true);
			j4 = new JRadioButton("����", false);
			j5 = new JRadioButton("����", false);
			ButtonGroup b2 = new ButtonGroup();
			b2.add(j3);
			b2.add(j4);
			b2.add(j5);
			jp3.add(j3);
			jp3.add(j4);
			jp3.add(j5);
			add(jp3, "South");
			
			setSize(300, 200);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void main(String[] args) {
			new Jcheck();
		}
}
