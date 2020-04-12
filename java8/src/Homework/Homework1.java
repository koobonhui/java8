package Homework;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Homework1 extends JFrame{
	
	ImageIcon[] imgIcons = {
			new ImageIcon("Image/c.png"),           // 0번 가위
			new ImageIcon("Image/b.png"),			// 1번 바위
			new ImageIcon("Image/a.png")			// 2번 보
			
	};
	
	ImageIcon[] img = { new ImageIcon("Image/22.png"),
					    new ImageIcon("Image/33.png"),
					    new ImageIcon("Image/44.png") 
					  };
	
	SelectPanel select = new SelectPanel();
	ResultDisplay result = new ResultDisplay();
	
	public Homework1() {
		super("가위 바위 보 게임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(result,"Center");
		add(select, "South");
		
		setSize(1000,1000);
		setVisible(true);
	}
	
	
class SelectPanel extends JPanel{            // 내가 선택하는 자리
	
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
	
class ResultDisplay extends JPanel{          // 결과 나오는 자리
	
		JLabel userJLabel = new JLabel();
		JLabel comJLabel = new JLabel();
		JLabel resultJLabel = new JLabel();
		
		public ResultDisplay() {
			setBackground(Color.yellow);
			add(userJLabel);
			add(resultJLabel);
			add(comJLabel);
		}
		
		public void output(Icon img, Icon comImage, Icon im) {
			userJLabel.setText("나");
			userJLabel.setFont(new Font("DIALOG", Font.BOLD, 30));
			userJLabel.setIcon(img);
			userJLabel.setHorizontalTextPosition(JLabel.LEFT);    // 사진 왼쪽으로 라벨 나오게
			comJLabel.setText("컴퓨터");
			comJLabel.setFont(new Font("DIALOG", Font.BOLD, 30));
			comJLabel.setIcon(comImage);
			resultJLabel.setIcon(im);
//			resultJLabel.setFont(new Font("DIALOG", Font.BOLD, 30));
			
		}
	}

class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//getSource가 Object 타입임으로 타입변환을 해야한다.
			JButton btnSrc = (JButton)e.getSource();
			int selCom = (int)(Math.random()*3); // 0:가위  1:바위, 2:보
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


