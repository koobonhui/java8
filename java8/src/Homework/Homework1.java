package Homework;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Homework1 extends JFrame {
	
	ImageIcon[] img = {
			new ImageIcon("Image/c.png"),           // 0�� ����
			new ImageIcon("Image/b.png"),			// 1�� ����
			new ImageIcon("Image/a.png")			// 2�� ��
			
	};
	
	ImageIcon[] img2 = { new ImageIcon("Image/22.png"),     // Win ����
					    new ImageIcon("Image/33.png"),	   // Draw ����
					    new ImageIcon("Image/44.png")      // Lose ����
					  };
	
	Select select = new Select();
	Result result = new Result();
	
	public Homework1() {
		super("���� ���� ��");
		
		add(result,"Center");
		add(select, "South");
		
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
class Select extends JPanel{            // ���� �����ϴ� �ڸ�
	
		JButton[] Buttons = new JButton[3];
		
		public Select() {
			setBackground(Color.white);
			
			for(int i=0; i<img.length; i++) {
				Buttons[i] = new JButton(img[i]);
				add(Buttons[i]);
				
				Buttons[i].addActionListener(new Action());
				Buttons[i].setBorderPainted(false);			// ��ư �׵θ� �����
				Buttons[i].setBackground(Color.white);		// ��ư ��� ������� �����
			}
		}
	}
	
class Result extends JPanel{          // ��� ������ �ڸ�
	
		JLabel user = new JLabel();
		JLabel com = new JLabel();
		JLabel result = new JLabel();
		
		public Result() {
			setBackground(Color.gray);
			add(user);
			add(result);
			add(com);
		}
		
		public void output(Icon me, Icon computer, Icon re) {
			user.setText("��");
			user.setFont(new Font("DIALOG", Font.BOLD, 30));
			user.setIcon(me);
			user.setHorizontalTextPosition(JLabel.LEFT);    // ���� �������� �� ������
			com.setText("��ǻ��");
			com.setFont(new Font("DIALOG", Font.BOLD, 30));
			com.setIcon(computer);
			result.setIcon(re);
			
		}
	}

class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//getSource�� Object Ÿ�������� Ÿ�Ժ�ȯ�� �ؾ��Ѵ�.
			JButton btn = (JButton)e.getSource();
			int Com = (int)(Math.random()*3); // 0:����  1:����, 2:��
			ImageIcon s = null;
			
			if(btn.getIcon() == img[0] && Com == 2 || 
			   btn.getIcon() == img[1] && Com == 0 ||
			   btn.getIcon() == img[2] && Com == 1 )
				s = img2[0];
			else if(btn.getIcon() == img[0] && Com == 0 ||
				    btn.getIcon() == img[1] && Com == 1 ||
				    btn.getIcon() == img[2] && Com == 2 )
				s = img2[1];
			else 
				s = img2[2];
			
			result.output(btn.getIcon(), img[Com], s);
			
			
		}
		
	}


public static void main(String[] args) {
		new Homework1();

	}

}


