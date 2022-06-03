package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiEx03 {
	public static void main(String[] args) {

		JFrame j = new JFrame();
		j.setLayout(new BorderLayout());
		
		j.add(new JButton("µ¿"), BorderLayout.EAST);
		j.add(new JButton("¼­"), BorderLayout.WEST);
		j.add(new JButton("³²"), BorderLayout.SOUTH);
		j.add(new JButton("ºÏ"), BorderLayout.NORTH);
		j.add(new JButton("Áß¾Ó"), BorderLayout.CENTER);
		
		j.setSize(300, 300);
		j.setVisible(true);
		
	}
}
