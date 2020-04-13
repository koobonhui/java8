package Homework;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Homework2 extends JFrame {

	Number number = new Number();

	public Homework2() {

		add(number);
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	class Number extends JPanel {

		public Number() {
			String[] title = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
					"17", "18", "19", "20", "21", "22", "23", "24" };
			
			JButton[] btn = new JButton[24];

			GridLayout g = new GridLayout(5, 5);
			setLayout(g);

			for(int i = 0; i < btn.length; i++) {
				btn[i] = new JButton(title[i]);
				add(btn[i]);
				btn[i].addKeyListener(new Key());
			}
		}
	}
	
	class Key implements KeyListener {
		
		@Override
		public void keyPressed(KeyEvent e) {
			
			int key = e.getKeyCode();
			JButton[] btn = (JButton[])e.getSource();
			
			switch(KeyEvent.getKeyText(key)) 
			{
				case "Up" :
				case "Down" :
				case "Left" :
				case "Right" :
					
					
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO 자동 생성된 메소드 스텁
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO 자동 생성된 메소드 스텁
			
		}
		
	}

	public static void main(String[] args) {
		new Homework2();
	}
}