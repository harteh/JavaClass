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
 * 1. ����Ʈ���� ������ ���������� �ϰ�, Ok, Cancel ��ư�������� frame�ϳ� ������
 * Ok��ư�� ������ ��Ȯ�Ρ�, Cancel�� ������ ��ư�� ��Ȱ��ȭ ���Ѷ�.
 * (MouseAdapter�� ����)
 * 
 * 2. ������ư �̸��� ��magenta��, ��red�� �ΰ��� �����ϰ�
 * magenta�� ������ ��ư�� ���� magenta��, red�� ������ red������ �����ض�
 * 
 * 3. JLabel j=new JLabel(��Hi"); 
 * ���� j�� ���콺�� Ŭ���ϸ� ���ȳ硱�̶�� �ٲٴ� �ڵ带 �ۼ��ض�
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
				jL1.setText("�ȳ�");
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
