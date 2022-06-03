package gui;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

class Mouse extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스클릭");
	}
}

public class GuiEx05Mouse  {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());

		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		
		j1.addMouseListener(new Mouse());	//클릭이벤트
		j2.addMouseListener(new Mouse());
		
		f.add(j1);
		f.add(j2);
		
		f.setSize(500, 250);
		f.setVisible(true);
		
		
		
		new GuiEx05Mouse();
	}
}
