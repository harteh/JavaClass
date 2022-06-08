package awtFrame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Ex09 extends JFrame {

	JSlider j = new JSlider(100, 200, 150);
	JLabel j1 = new JLabel("  ");
	
	Ex09(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		j.setMajorTickSpacing(20);	//Å« ´«±Ý °£°Ý
		j.setPaintLabels(true);
		j.setPaintTicks(true);
		
		c.add(j);
		c.add(j1);
		
		setTitle("JSlider");
		setSize(500, 350);	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex09();
	}

}
