package awtFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex09Slider extends JFrame {

	JSlider j = new JSlider(100, 200, 150);
	JLabel j1 = new JLabel("  ");
	
	Ex09Slider(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		j.setMajorTickSpacing(20);	//큰 눈금 간격
		j.setPaintLabels(true);
		j.setPaintTicks(true);
		
		j1.setHorizontalAlignment(JLabel.CENTER);
		//문자열 위치를 중앙에 위치

		j1.setOpaque(true);		//투명도 설정
		j1.setBackground(Color.orange);
		j1.setText(Integer.toString(j.getValue()));
		//눈금 정수값을 문자열로 변경해서 프레임에 띄운다
		
		j.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// 눈금 변경 이벤트
				j1.setText( Integer.toString(j.getValue()) );
			}
		});
		
		
		
		c.add(j);
		c.add(j1);
		
		setTitle("JSlider");
		setSize(500, 350);	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex09Slider();
	}

}
