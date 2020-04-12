package Homework;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Homework1 extends JFrame {
	
	ImageIcon[] imgIcons = {
			new ImageIcon("Image/c.png"),           // 0�� ����
			new ImageIcon("Image/b.png"),			// 1�� ����
			new ImageIcon("Image/a.png")			// 2�� ��
			
	};
	
	ImageIcon[] img = { new ImageIcon("Image/22.png"),     // Win ����
					    new ImageIcon("Image/33.png"),	   // Draw ����
					    new ImageIcon("Image/44.png")      // Lose ����
					  };
	
	SelectPanel select = new SelectPanel();
	ResultDisplay result = new ResultDisplay();
	
	public Homework1() {
		super("���� ���� �� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(result,"Center");
		add(select, "South");
		
		setSize(1000,1000);
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
				btnButtons[i].setBorderPainted(false);			// ��ư �׵θ� �����
				btnButtons[i].setBackground(Color.white);		// ��ư ��� ������� �����
			}
		}
	}
	
class ResultDisplay extends JPanel{          // ��� ������ �ڸ�
	
		JLabel userJLabel = new JLabel();
		JLabel comJLabel = new JLabel();
		JLabel resultJLabel = new JLabel();
		
		public ResultDisplay() {
			setBackground(Color.gray);
			add(userJLabel);
			add(resultJLabel);
			add(comJLabel);
		}
		
		public void output(Icon img, Icon comImage, Icon im) {
			userJLabel.setText("��");
			userJLabel.setFont(new Font("DIALOG", Font.BOLD, 30));
			userJLabel.setIcon(img);
			userJLabel.setHorizontalTextPosition(JLabel.LEFT);    // ���� �������� �� ������
			comJLabel.setText("��ǻ��");
			comJLabel.setFont(new Font("DIALOG", Font.BOLD, 30));
			comJLabel.setIcon(comImage);
			resultJLabel.setIcon(im);
			
		}
	}

class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//getSource�� Object Ÿ�������� Ÿ�Ժ�ȯ�� �ؾ��Ѵ�.
			JButton btnSrc = (JButton)e.getSource();
			int selCom = (int)(Math.random()*3); // 0:����  1:����, 2:��
			ImageIcon s = null;
			
			if(btnSrc.getIcon().equals(imgIcons[0]) && selCom == 2 || 
			   btnSrc.getIcon().equals(imgIcons[1]) && selCom == 0 ||
			   btnSrc.getIcon().equals(imgIcons[2]) && selCom == 1 )
				s = img[0];
			else if(btnSrc.getIcon().equals(imgIcons[0]) && selCom == 0 ||
				    btnSrc.getIcon().equals(imgIcons[1]) && selCom == 1 ||
				    btnSrc.getIcon().equals(imgIcons[2]) && selCom == 2 )
				s = img[1];
			else 
				s = img[2];
			result.output(btnSrc.getIcon(), imgIcons[selCom], s);
			
			
		}
		
	}


public static void main(String[] args) {
		new Homework1();

	}

}


