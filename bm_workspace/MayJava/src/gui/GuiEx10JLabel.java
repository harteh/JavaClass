package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MouseEx10 extends MouseAdapter {
	public void mouseEntered(MouseEvent e) {
		JLabel j = (JLabel) e.getSource();	//이벤트 발생원천
		j.setText("재밋어");	//문자열 세팅
		
	}
	
	public void mouseExited(MouseEvent e) {
		JLabel j = (JLabel) e.getSource();
		j.setText("자바는");
		
	}
}


public class GuiEx10JLabel extends JFrame {
	
	GuiEx10JLabel(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel("자바는");
		j.addMouseListener(new MouseEx10());
		
		
		
		c.add(j);
		
		setSize(500, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiEx10JLabel();
	}

}
