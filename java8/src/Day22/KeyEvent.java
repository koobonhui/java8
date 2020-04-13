package Day22;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyEvent {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		
		TextField tf = new TextField();
		
		tf.setEnabled(false);
		tf.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.add(tf);
		f.setSize(200, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(java.awt.event.KeyEvent e) {
				int key = e.getKeyChar();
				tf.setText(String.valueOf((char)key));
			}
			
			@Override
			public void keyReleased(java.awt.event.KeyEvent e) {
				int key = e.getKeyCode();
				String temp = tf.getText();
				tf.setText(temp + " : " + java.awt.event.KeyEvent.getKeyText(key));
				
			}
			
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
			}
		});
	}

}
