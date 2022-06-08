package awtFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 배치관리자를 GridLayout으로 1행5열로설정한다. 
 * 5개의버튼을객체배열형태로만들어 위에서준색을각각버튼에입히고컨테이너에부착한다.
 */
public class Ex10Array extends JFrame{
	
	Ex10Array(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 5));
		
		Color color[] = {
				Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE
				};
		
		int size = color.length;
		JButton[] j = new JButton[size];
		
		for(int i=0; i<size; i++) {
			j[i] = new JButton();
			j[i].setBackground(color[i]);
			c.add(j[i]);
		}
		
		//setting
		setSize(500, 350);	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public static void main(String[] args) {
		new Ex10Array();
	}
}
