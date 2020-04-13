package Day22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionEventEx extends JFrame implements ActionListener {

		JButton jbt1, jbt2, jbt3, jbt4;
		
		public ActionEventEx() {
			
			super("�׼��̺�Ʈ ó��");
			setLayout(new FlowLayout());
			
			jbt1 = new JButton("�Է�");
			add(jbt1);      // this�� JFrame
			jbt2 = new JButton("Ȯ��");
			add(jbt2);
			jbt3 = new JButton("�ɼ�");
			add(jbt3);
			jbt4 = new JButton("�޽���");
			add(jbt4);
			
			jbt1.addActionListener(this);   // this �� ActionListener
			jbt2.addActionListener(this);
			jbt3.addActionListener(this);
			jbt4.addActionListener(this);
			
			setSize(300, 200);
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == jbt1) {
				String name = JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���");
				System.out.println(name);
			}
			if(e.getSource() == jbt2) {
				int con = JOptionPane.showConfirmDialog(this, "Ȯ��?");
				if(con == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
			if(e.getSource() == jbt3) {
				String[] option = {"�˻�", "�߰�", "���"};
				JOptionPane.showOptionDialog(this, "���ϴ� �۾� ����", "�ɼ� ��ȭ����", JOptionPane.YES_NO_CANCEL_OPTION, 
											JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
			}
			if(e.getSource() == jbt4) {
				JOptionPane.showMessageDialog(this, "�޼��� ��ȭ ����");
			}
		}
		public static void main(String[] args) {
			ActionEventEx ae = new ActionEventEx();
			ae.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
}
