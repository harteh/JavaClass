package awtFrame;

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;

public class Frame01 {
	public static void main(String[] args) {
		Frame frame = new Frame("ù ������"); 	//������ ����
		frame.setBounds(800, 100, 400, 300);	//(x��ǥ, y��ǥ, �ʺ�, ����)
		
		System.out.println(frame.getBounds().getWidth());	//double�� �Ӽ�
		System.out.println(frame.getBounds().height);		//int�� �Ӽ�
		
		frame.setBackground(Color.blue);
		
		frame.setVisible(true);
	}
}
