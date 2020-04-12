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
	
	SelectPanel select = new SelectPanel();
	ResultDisplay result = new ResultDisplay();
	
	public Homework1() {
		super("가위 바위 보 게임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(result,"Center");
		add(select, "South");
		
		
		setSize(500,500);
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
			//getSource가 Object 타입임으로 타입변환을 해야한다.
			JButton btnSrc = (JButton)e.getSource();
			int selCom = (int)(Math.random()*3); // 0:가위  1:바위, 2:보
			
			String res = "";
			
			//유저가 이기는 경우
			if(btnSrc.getIcon().equals(imgIcons[0]) && selCom == 2 || 
			   btnSrc.getIcon().equals(imgIcons[1]) && selCom == 0 ||
			   btnSrc.getIcon().equals(imgIcons[2]) && selCom == 1 )
				res = "당신이 이겼습니다!";
			else if(btnSrc.getIcon().equals(imgIcons[0]) && selCom == 0 ||
				    btnSrc.getIcon().equals(imgIcons[1]) && selCom == 1 ||
				    btnSrc.getIcon().equals(imgIcons[2]) && selCom == 2 )
				res = "비겼습니다!!";
			else 
				res = "당신이 졌습니다...";
			
			result.output(btnSrc.getIcon(), imgIcons[selCom], res);
			
			
		}
		
	}

public static void main(String[] args) {
		new Homework1();

	}

}


