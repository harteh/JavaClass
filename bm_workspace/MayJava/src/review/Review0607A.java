package review;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 1. 컨텐트팬의 배경색을 blue색으로 하고, 
 * 		Ok, Cancel, Get 버튼을 부착한 프로그램 작성해라.
 * 1.1 Ok 버튼을 누르면 컨텐트팬 색을 orange, 
 * 		Cancel 버튼을 누르면 버튼을 비활성화시키고 
 * 		Get 버튼을 누르면 버튼의 위치(x,y)값을 출력해라
 */
public class Review0607A extends JFrame{
	
	Review0607A(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.setBackground(Color.BLUE);
		
		JButton j1 = new JButton("OK"); 
		JButton j2 = new JButton("Cancle"); 
		JButton j3 = new JButton("Get"); 
		
		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.ORANGE);
			}
		});
		
		j2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				j2.setEnabled(false);
			}
		});
		
		j3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = j3.getX();
				int y = j3.getY();
				System.out.println(x +" "+ y);
			}
		});
		
		
		
		//setting
		c.add(j1);
		c.add(j2);
		c.add(j3);
		
		setSize(350, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Review0607A();
	}
}
