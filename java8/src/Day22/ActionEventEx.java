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
			
			super("액션이벤트 처리");
			setLayout(new FlowLayout());
			
			jbt1 = new JButton("입력");
			add(jbt1);      // this는 JFrame
			jbt2 = new JButton("확인");
			add(jbt2);
			jbt3 = new JButton("옵션");
			add(jbt3);
			jbt4 = new JButton("메시지");
			add(jbt4);
			
			jbt1.addActionListener(this);   // this 는 ActionListener
			jbt2.addActionListener(this);
			jbt3.addActionListener(this);
			jbt4.addActionListener(this);
			
			setSize(300, 200);
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == jbt1) {
				String name = JOptionPane.showInputDialog(this, "이름을 입력하세요");
				System.out.println(name);
			}
			if(e.getSource() == jbt2) {
				int con = JOptionPane.showConfirmDialog(this, "확인?");
				if(con == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
			if(e.getSource() == jbt3) {
				String[] option = {"검색", "추가", "취소"};
				JOptionPane.showOptionDialog(this, "원하는 작업 선택", "옵션 대화상자", JOptionPane.YES_NO_CANCEL_OPTION, 
											JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
			}
			if(e.getSource() == jbt4) {
				JOptionPane.showMessageDialog(this, "메세지 대화 상자");
			}
		}
		public static void main(String[] args) {
			ActionEventEx ae = new ActionEventEx();
			ae.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
}
