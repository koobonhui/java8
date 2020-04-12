package Homework;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Homework1 extends JFrame{
	
	ImageIcon[] imgIcons = {
			new ImageIcon("Image/c.png"),           // 0�� ����
			new ImageIcon("Image/b.png"),			// 1�� ����
			new ImageIcon("Image/a.png")			// 2�� ��
			
	};
	
	SelectPanel select = new SelectPanel();
	ResultDisplay result = new ResultDisplay();
	
	public Homework1() {
		super("���� ���� �� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(result,"Center");
		add(select, "South");
		
		
		setSize(500,500);
		setVisible(true);
	}
	
	
class SelectPanel extends JPanel{            // ���� �����ϴ� �ڸ�
	
		JButton[] btnButtons = new JButton[3];
		
		public SelectPanel() {
			setBackground(Color.white);
			
			for(int i=0; i<imgIcons.length; i++) {
				btnButtons[i] = new JButton(imgIcons[i]);
				this.add(btnButtons[i]);
				
				btnButtons[i].addActionListener(new EventHandler());
			}
		}
	}
	
class ResultDisplay extends JPanel{          // ��� ������ �ڸ�
	
		JLabel userJLabel = new JLabel("you");
		JLabel comJLabel = new JLabel("computer");
		JLabel resultJLabel = new JLabel("winner");
		
		public ResultDisplay() {
			setBackground(Color.yellow);
			add(userJLabel);
			add(resultJLabel);
			add(comJLabel);
		}
		
		public void output(Icon img,Icon comImage, String res ) {
			userJLabel.setIcon(img);
			userJLabel.setHorizontalTextPosition(JLabel.LEFT);
			comJLabel.setIcon(comImage);
			resultJLabel.setText(res);
			result.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
			
		}
	}

class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//getSource�� Object Ÿ�������� Ÿ�Ժ�ȯ�� �ؾ��Ѵ�.
			JButton btnSrc = (JButton)e.getSource();
			int selCom = (int)(Math.random()*3); // 0:����  1:����, 2:��
			
			String res = "";
			
			//������ �̱�� ���
			if(btnSrc.getIcon().equals(imgIcons[0]) && selCom == 2 || 
			   btnSrc.getIcon().equals(imgIcons[1]) && selCom == 0 ||
			   btnSrc.getIcon().equals(imgIcons[2]) && selCom == 1 )
				res = "����� �̰���ϴ�!";
			else if(btnSrc.getIcon().equals(imgIcons[0]) && selCom == 0 ||
				    btnSrc.getIcon().equals(imgIcons[1]) && selCom == 1 ||
				    btnSrc.getIcon().equals(imgIcons[2]) && selCom == 2 )
				res = "�����ϴ�!!";
			else 
				res = "����� �����ϴ�...";
			
			result.output(btnSrc.getIcon(), imgIcons[selCom], res);
			
			
		}
		
	}

public static void main(String[] args) {
		new Homework1();

	}

}


