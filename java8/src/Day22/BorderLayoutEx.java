package Day22;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;

import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	
		public BorderLayoutEx() {
			super("보더레이아웃");
			add("North", new Button("North"));
			add(BorderLayout.EAST, new Button("East"));
			add(new Button("Center"), BorderLayout.CENTER);
			add(new Button("South"), BorderLayout.SOUTH);
			add(new Button("West"), BorderLayout.WEST);
			
			setSize(500, 500);
			setVisible(true);
		}
		
		public static void main(String[] args) {
			BorderLayoutEx be = new BorderLayoutEx();
			be.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

}
