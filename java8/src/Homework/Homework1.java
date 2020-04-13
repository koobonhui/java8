package Homework;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Homework1 extends JFrame {
	
	ImageIcon[] img = {
			new ImageIcon("Image/c.png"),           // 0번 가위
			new ImageIcon("Image/b.png"),			// 1번 바위
			new ImageIcon("Image/a.png")			// 2번 보
			
	};
	
	ImageIcon[] img2 = { new ImageIcon("Image/22.png"),     // Win 사진
					    new ImageIcon("Image/33.png"),	   // Draw 사진
					    new ImageIcon("Image/44.png")      // Lose 사진
					  };
	
	Select select = new Select();
	Result result = new Result();
	
	public Homework1() {
		super("가위 바위 보");
		
		add(result,"Center");
		add(select, "South");
		
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
class Select extends JPanel{            // 내가 선택하는 자리
	
		JButton[] Buttons = new JButton[3];
		
		public Select() {
			setBackground(Color.white);
			
			for(int i=0; i<img.length; i++) {
				Buttons[i] = new JButton(img[i]);
				add(Buttons[i]);
				
				Buttons[i].addActionListener(new Action());
				Buttons[i].setBorderPainted(false);			// 버튼 테두리 지우기
				Buttons[i].setBackground(Color.white);		// 버튼 배경 흰색으로 만들기
			}
		}
	}
	
class Result extends JPanel{          // 결과 나오는 자리
	
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
			user.setText("나");
			user.setFont(new Font("DIALOG", Font.BOLD, 30));
			user.setIcon(me);
			user.setHorizontalTextPosition(JLabel.LEFT);    // 사진 왼쪽으로 라벨 나오게
			com.setText("컴퓨터");
			com.setFont(new Font("DIALOG", Font.BOLD, 30));
			com.setIcon(computer);
			result.setIcon(re);
			
		}
	}

class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//getSource가 Object 타입임으로 타입변환을 해야한다.
			JButton btn = (JButton)e.getSource();
			int Com = (int)(Math.random()*3); // 0:가위  1:바위, 2:보
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


