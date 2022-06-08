package awtFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * ��ġ�����ڸ� GridLayout���� 1��5���μ����Ѵ�. 
 * 5���ǹ�ư����ü�迭���·θ���� �������ػ���������ư�������������̳ʿ������Ѵ�.
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
