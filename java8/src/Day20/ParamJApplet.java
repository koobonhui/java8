package Day20;

import java.awt.Graphics;

import javax.swing.*;

public class ParamJApplet extends JPanel {

		// Ŭ������ �����ѹ��� ����
		// Ŭ������ ��ü�� ������ ���۽� �۽źο��� ���� Ŭ�������� Ȯ���ϱ� ���Ͽ� �����.
		// ������� ������ �������� ����
		private static final long serialVersionUID = 1L;
		
		String title;
		
		public void init(String title) {
			this.title = title;
			if(title == null) {
				title = "�μ� ����";
			}
		}
		
		public void paint(Graphics g) {
			g.drawString(title, 100, 100);
		}
		
}
