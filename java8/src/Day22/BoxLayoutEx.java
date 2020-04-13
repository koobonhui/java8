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
			super("�ڽ����̾ƿ�");
			
			Box hbox = Box.createHorizontalBox();
			hbox.add(Box.createHorizontalStrut(30));		// ����ũ�� ������Ʈ
			hbox.add(new JCheckBox("�츮����"));
			hbox.add(Box.createHorizontalStrut(30));
			hbox.add(new JCheckBox("�Ｚ����"));
			hbox.add(Box.createHorizontalStrut(30));
			hbox.add(new JCheckBox("�������"));
			hbox.add(Box.createGlue());
			
			JPanel lpanel = new JPanel(new BorderLayout());      // �������̾ƿ��� ����ϴ� �г�
			lpanel.setBorder(new TitledBorder(new EtchedBorder(), "����ȸ�� ����"));
			lpanel.add(hbox, BorderLayout.CENTER);				// �гο� �ڽ� ����
			
			Box hhbox = Box.createHorizontalBox();
			hhbox.add(Box.createHorizontalGlue());
			hhbox.add(new JCheckBox("��������"));
			hhbox.add(Box.createHorizontalGlue());
			hhbox.add(new JCheckBox("��ȯ����"));
			hhbox.add(Box.createHorizontalGlue());
			hhbox.add(new JCheckBox("�������"));
//			hhbox.add(Box.createGlue());
			
			JPanel llpanel = new JPanel(new BorderLayout());
			llpanel.setBorder(new TitledBorder(new EtchedBorder(), "���� ����"));
			llpanel.add(hhbox, BorderLayout.CENTER);
			
			Box cBox = Box.createVerticalBox();		// �����ڽ�
			cBox.add(lpanel);						// �г��߰�
			cBox.add(llpanel);
			add(cBox, BorderLayout.CENTER);			// �����ӿ� �߰�
		}
		
		public static void main(String[] args) {
			
			BoxLayoutEx be = new BoxLayoutEx();
			be.setDefaultCloseOperation(EXIT_ON_CLOSE);
			be.setSize(400, 200);
			be.setVisible(true);
		}
}
