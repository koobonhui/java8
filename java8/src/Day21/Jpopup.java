package Day21;

import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
public class Jpopup extends JFrame {
	
		String[] title = {"사번", "성명", "부서"};
		JRadioButtonMenuItem rbm[];
		
		public Jpopup() {
			super("PopUp");
			final JPopupMenu pmenu = new JPopupMenu();
			ButtonGroup tgroup = new ButtonGroup();
			rbm = new JRadioButtonMenuItem[3];
			
			for(int i = 0; i < rbm.length; i++) {
				rbm[i] = new JRadioButtonMenuItem(title[i]);
				pmenu.add(rbm[i]);
				tgroup.add(rbm[i]);
			}
			
			//마우스 이벤트를 리스너에 등록
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					checkForTriggerEvent(e); }
				public void mouseReleased(MouseEvent e) {
					checkForTriggerEvent(e); }
				private void checkForTriggerEvent(MouseEvent e) {
					if(e.isPopupTrigger())
						pmenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
			);
			
			setSize(300,200);
			setVisible(true);
		}

		public static void main(String[] args) {
			Jpopup pt = new Jpopup();
			pt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
}
