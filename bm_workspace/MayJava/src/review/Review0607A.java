package review;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 1. ����Ʈ���� ������ blue������ �ϰ�, 
 * 		Ok, Cancel, Get ��ư�� ������ ���α׷� �ۼ��ض�.
 * 1.1 Ok ��ư�� ������ ����Ʈ�� ���� orange, 
 * 		Cancel ��ư�� ������ ��ư�� ��Ȱ��ȭ��Ű�� 
 * 		Get ��ư�� ������ ��ư�� ��ġ(x,y)���� ����ض�
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
