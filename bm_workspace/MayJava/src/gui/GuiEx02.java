package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiEx02 extends JFrame {
	
	GuiEx02(){
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(new JButton("1"));
		
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new GuiEx02();
		
	}
}
