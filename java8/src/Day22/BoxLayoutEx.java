package Day22;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class BoxLayoutEx extends JFrame {

		public BoxLayoutEx() {
			super("박스레이아웃");
			
			Box hbox = Box.createHorizontalBox();
			hbox.add(Box.createHorizontalStrut(30));		// 고정크기 컴포넌트
			hbox.add(new JCheckBox("우리투자"));
			hbox.add(Box.createHorizontalStrut(30));
			hbox.add(new JCheckBox("삼성증권"));
			hbox.add(Box.createHorizontalStrut(30));
			hbox.add(new JCheckBox("대우증권"));
			hbox.add(Box.createGlue());
			
			JPanel lpanel = new JPanel(new BorderLayout());      // 보더레이아웃을 사용하는 패널
			lpanel.setBorder(new TitledBorder(new EtchedBorder(), "증권회사 구분"));
			lpanel.add(hbox, BorderLayout.CENTER);				// 패널에 박스 장착
			
			Box hhbox = Box.createHorizontalBox();
			hhbox.add(Box.createHorizontalGlue());
			hhbox.add(new JCheckBox("국민은행"));
			hhbox.add(Box.createHorizontalGlue());
			hhbox.add(new JCheckBox("외환은행"));
			hhbox.add(Box.createHorizontalGlue());
			hhbox.add(new JCheckBox("기업은행"));
//			hhbox.add(Box.createGlue());
			
			JPanel llpanel = new JPanel(new BorderLayout());
			llpanel.setBorder(new TitledBorder(new EtchedBorder(), "은행 구분"));
			llpanel.add(hhbox, BorderLayout.CENTER);
			
			Box cBox = Box.createVerticalBox();		// 수직박스
			cBox.add(lpanel);						// 패널추가
			cBox.add(llpanel);
			add(cBox, BorderLayout.CENTER);			// 프레임에 추가
		}
		
		public static void main(String[] args) {
			
			BoxLayoutEx be = new BoxLayoutEx();
			be.setDefaultCloseOperation(EXIT_ON_CLOSE);
			be.setSize(400, 200);
			be.setVisible(true);
		}
}
