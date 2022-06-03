package gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiEx04 extends JFrame  {
	
	GuiEx04(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		for(int i=0; i<10; i++) {
			String str = Integer.toString(i+1);
			JButton b = new JButton(str);
			c.add(b);
		}
		
		setSize(500, 250);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new GuiEx04();
	}
}
