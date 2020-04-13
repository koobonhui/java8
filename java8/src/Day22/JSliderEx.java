package Day22;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JSlider;


public class JSliderEx extends WindowAdapter {
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("슬라이더");
		
		JSlider s = new JSlider(0, 100, 50);
		
		s.setMajorTickSpacing(10);
		s.setMinorTickSpacing(1);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		
		s.addChangeListener(e -> {
			JSlider js = (JSlider)e.getSource();
			int value = js.getValue();
			System.out.println("현재값 : " + value);
		});
		
		f.add(s);
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
