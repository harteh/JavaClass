package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiEx03 {
	public static void main(String[] args) {

		JFrame j = new JFrame();
		j.setLayout(new BorderLayout());
		
		j.add(new JButton("��"), BorderLayout.EAST);
		j.add(new JButton("��"), BorderLayout.WEST);
		j.add(new JButton("��"), BorderLayout.SOUTH);
		j.add(new JButton("��"), BorderLayout.NORTH);
		j.add(new JButton("�߾�"), BorderLayout.CENTER);
		
		j.setSize(300, 300);
		j.setVisible(true);
		
	}
}
