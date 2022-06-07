package review;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/*
 * 1. 컨텐트팬의 배경색을 빨간색으로 하고, Ok, Cancel 버튼을부착한 frame하나 만들어라
 * Ok버튼을 누르면 “확인”, Cancel을 누르면 버튼을 비활성화 시켜라.
 * (MouseAdapter로 접근)
 * 
 * 2. 라디오버튼 이름을 “magenta”, ”red” 두개로 설정하고
 * magenta를 누르면 버튼의 색을 magenta로, red를 누르면 red색으로 변경해라
 * 
 * 3. JLabel j=new JLabel(“Hi"); 
 * 에서 j를 마우스로 클릭하면 “안녕”이라고 바꾸는 코드를 작성해라
 */

public class Review0607C extends JFrame {
	
	Review0607C () {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//1
		c.setBackground(Color.RED);		
		JButton j1 = new JButton("OK");
		JButton j2 = new JButton("Cancel");
		
		j1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("OK.");
			}
		});
		j2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				j2.setEnabled(false);
			}
		});
		
		//2
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jr1 = new JRadioButton("magenta");
		JRadioButton jr2 = new JRadioButton("red");
		bg.add(jr1);
		bg.add(jr2);
		
		jr1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				jr1.setBackground(Color.magenta);
				jr2.setBackground(Color.magenta);
			}
		});
		
		jr2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				jr1.setBackground(Color.red);
				jr2.setBackground(Color.red);
			}
		});
		
		//3
		JLabel jL1=new JLabel("Hi");
		jL1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				jL1.setText("안녕");
			}
		});

		
		//setting
		c.add(j1);
		c.add(j2);
		
		c.add(jr1);
		c.add(jr2);
		
		c.add(jL1);
		
		setSize(500, 350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Review0607C();
	}
}
