package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiEx03 {
	public static void main(String[] args) {

		JFrame j = new JFrame();
//		j.setLayout(new BorderLayout());
		j.setLayout(new BorderLayout(100, 20));		//hgap, vgap
		
		j.add(new JButton("east"), BorderLayout.EAST);
		j.add(new JButton("west"), BorderLayout.WEST);
		j.add(new JButton("south"), BorderLayout.SOUTH);
		j.add(new JButton("north"), BorderLayout.NORTH);
		j.add(new JButton("center"), BorderLayout.CENTER);
		
		j.setSize(300, 300);
		j.setVisible(true);
		
	}
}
