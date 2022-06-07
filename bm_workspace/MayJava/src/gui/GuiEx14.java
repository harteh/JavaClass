package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GuiEx14  extends JFrame {
	GuiEx14(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel("Hello");
		
		//이미지 삽입 - Lable 에 부착해야한다.
		ImageIcon i = new ImageIcon( "E://26.newJava/454_387_up.jpg" );
		JLabel j1 = new JLabel(i);
		j1.setSize(400, 300);
		
		JLabel j2 = new JLabel("화요일입니다.", SwingConstants.CENTER);
		
		
		c.add(j);
		c.add(j1);
		c.add(j2);
		
		setSize(600, 550);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiEx14();
	}

}
