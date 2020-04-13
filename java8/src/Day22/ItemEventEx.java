package Day22;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class ItemEventEx extends JFrame {

		JLabel txt1, txt2;
		JRadioButton r1, r2, r3, r4, r5, r6;
		
		public ItemEventEx() {
			super("아이템이벤트");
			setLayout(new FlowLayout());
			
			Box hbox = Box.createHorizontalBox();
			ButtonGroup rgroup = new ButtonGroup();
			
			rgroup.add(r1 = new JRadioButton("우리투자증권"));
			hbox.add(r1);
			hbox.add(Box.createHorizontalStrut(30));
			
			rgroup.add(r2 = new JRadioButton("삼성증권"));
			hbox.add(r2);
			hbox.add(Box.createHorizontalStrut(30));
			
			rgroup.add(r3 = new JRadioButton("대우증권"));
			hbox.add(r3);
			hbox.add(Box.createHorizontalStrut(30));
			hbox.add(Box.createGlue());
			
			JPanel lpanel = new JPanel(new BorderLayout());    
			lpanel.setBorder(new TitledBorder(new EtchedBorder(), "증권회사 구분"));
			lpanel.add(hbox);
			
			Box hhbox = Box.createHorizontalBox();
			ButtonGroup cgroup = new ButtonGroup();
			
			cgroup.add(r4 = new JRadioButton("국민은행"));
			hhbox.add(r4);
			hhbox.add(Box.createHorizontalStrut(30));
			cgroup.add(r5 = new JRadioButton("외한은행"));
			hhbox.add(r5);
			hhbox.add(Box.createHorizontalStrut(30));
			cgroup.add(r6 = new JRadioButton("기업은행"));
			hhbox.add(r6);
			hhbox.add(Box.createHorizontalStrut(30));
			hhbox.add(Box.createGlue());
			
			JPanel llpanel = new JPanel(new BorderLayout());    
			llpanel.setBorder(new TitledBorder(new EtchedBorder(), "은행 구분"));
			llpanel.add(hhbox);
			
			Box cBox = Box.createVerticalBox();		
			cBox.add(lpanel);						
			cBox.add(llpanel);
			
			txt1 = new JLabel("증권회사 출력됨");
			txt1.setFont(new Font("굴림", Font.BOLD, 16));
			cBox.add(txt1);
			txt2 = new JLabel("은행 출력됨");
			txt2.setFont(new Font("굴림", Font.BOLD, 16));
			cBox.add(txt2);
			add(cBox);
			
			RBHandler rh = new RBHandler();
			r1.addItemListener(rh);
			r2.addItemListener(rh);
			r3.addItemListener(rh);
			r4.addItemListener(rh);
			r5.addItemListener(rh);
			r6.addItemListener(rh);
		}
		
private class RBHandler implements ItemListener {
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getSource() == r1)
					if(e.getStateChange() == ItemEvent.SELECTED)
						txt1.setText("우리투자증권 선택");
				
				if(e.getSource() == r2)
					if(e.getStateChange() == ItemEvent.SELECTED)
						txt1.setText("삼성증권 선택");
				
				if(e.getSource() == r3)
					if(e.getStateChange() == ItemEvent.SELECTED)
						txt1.setText("대우증권 선택");
				
				if(e.getSource() == r4)
					if(e.getStateChange() == ItemEvent.SELECTED)
						txt2.setText("국민은행 선택");
				
				if(e.getSource() == r5)
					if(e.getStateChange() == ItemEvent.SELECTED)
						txt2.setText("외한은행 선택");
				
				if(e.getSource() == r6)
					if(e.getStateChange() == ItemEvent.SELECTED)
						txt2.setText("기업은행 선택");
			}
		}
		
		public static void main(String[] args) {
			
			ItemEventEx ie = new ItemEventEx();
			ie.setDefaultCloseOperation(EXIT_ON_CLOSE);
			ie.setSize(400, 200);
			ie.setVisible(true);
		}
}
