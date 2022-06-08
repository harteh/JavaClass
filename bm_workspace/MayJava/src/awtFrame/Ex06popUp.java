package awtFrame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ex06popUp extends JFrame{
	
	Ex06popUp(){
		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
		
		//popUp
//		int r = JOptionPane.showConfirmDialog(null, "계속 할거야?",
//				"confim", JOptionPane.YES_NO_OPTION);
//		if(r == JOptionPane.YES_OPTION) {
//			System.out.println("yes");
//		}
		
		//popUpMessage
//		JOptionPane.showMessageDialog(null, "조심하세요",
//				"메시지", JOptionPane.ERROR_MESSAGE);
		
		//
		JOptionPane.showInputDialog("이름입력");
		

		//setting
		setSize(500, 350);	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Ex06popUp();
	}
}
