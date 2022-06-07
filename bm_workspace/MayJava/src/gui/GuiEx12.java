package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class GuiEx12 extends JFrame {
	GuiEx12(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 5));
		
		//JCheckBox 15개 -> 객체배열
		JCheckBox[] jArr = new JCheckBox[15];
		for(int i=0; i<jArr.length; i++) {
			jArr[i] = new JCheckBox("체크"+(i+1));
			
			c.add(jArr[i]);
		}
		
		
		
		
		setSize(600, 350);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiEx12();
	}

}
