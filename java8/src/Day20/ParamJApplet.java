package Day20;

import java.awt.Graphics;

import javax.swing.*;

public class ParamJApplet extends JPanel {

		// 클래스의 고유넘버를 지정
		// 클래스형 객체의 데이터 전송시 송신부에서 동일 클래스임을 확인하기 위하여 사용함.
		// 명시하지 않으면 랜덤으로 생성
		private static final long serialVersionUID = 1L;
		
		String title;
		
		public void init(String title) {
			this.title = title;
			if(title == null) {
				title = "인수 없음";
			}
		}
		
		public void paint(Graphics g) {
			g.drawString(title, 100, 100);
		}
		
}
