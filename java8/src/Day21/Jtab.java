package Day21;
import javax.swing.*;
import java.awt.*;

public class Jtab extends JFrame {

		public Jtab() {
			super("사원");
			JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);
			JPanel jpn1 = new JPanel();
			JPanel jpn2 = new JPanel();
			JPanel jpn3 = new JPanel();
			bTable jt1 = new bTable();
			eTable jt2 = new eTable();
			fTable jt3 = new fTable();
			
			jpn1.add(jt1);
			jpn2.add(jt2);
			jpn3.add(jt3);
			
			jtp.addTab("기본내용", jpn1);
			jtp.addTab("추가", jpn2);
			jtp.addTab("보안내용", jpn3);
			
			add(jtp, "Center");
			
			setSize(500, 200);
			setVisible(true);
		}
		public static void main(String[] args) {
			Jtab jt = new Jtab();
			jt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
}

class bTable extends JPanel {
	public bTable() {
		String[] title = {"사번", "성명", "부서"};
		String[][] data = {{"1","1","1"}, {"1","1","1"}, {"1","1","1"}};
		
		JTable table = new JTable(data, title);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(table, v, h);
		add(js);
	}
}

class eTable extends JPanel {
	public eTable() {
		String[] title = {"입사일", "주소", "전화"};
		String[][] data = {{"2","2","2"}, {"2","2","2"}, {"2","2","2"}};
		
		JTable table = new JTable(data, title);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(table, v, h);
		add(js);
	}
}

class fTable extends JPanel {
	public fTable() {
		String[] title = {"호봉", "근무평잠"};
		String[][] data = {{"3","3","3"}, {"3","3","3"}};
		
		JTable table = new JTable(data, title);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(table, v, h);
		add(js);
	}
}