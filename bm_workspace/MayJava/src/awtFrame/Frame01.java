package awtFrame;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;

public class Frame01 {
	public static void main(String[] args) {
		Frame frame = new Frame("첫 프레임"); 	//프레임 제목
		frame.setBounds(800, 100, 400, 300);	//(x좌표, y좌표, 너비, 높이)
		
		System.out.println(frame.getBounds().getWidth());	//double형 속성
		System.out.println(frame.getBounds().height);		//int형 속성
		
		frame.setBackground(Color.blue);
		
		frame.setVisible(true);
	}
}
