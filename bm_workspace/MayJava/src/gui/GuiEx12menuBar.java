package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GuiEx12menuBar extends JFrame{
	GuiEx12menuBar() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		setSize(600, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiEx12menuBar();
	}

}
