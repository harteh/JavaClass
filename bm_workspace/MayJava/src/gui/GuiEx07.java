package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiEx07 extends JFrame {
	
	GuiEx07(){
		super("��ư?");
		
		JButton b1 = new JButton("ok");
		JButton b2 = new JButton("cancel");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(b1);
		c.add(b2);
		
		//ok ��ư Ŭ�� �� �̺�Ʈ ó��
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���εǾ����ϴ�.");
				
				b2.setEnabled(true);	//��ư Ȱ��ȭ
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("����߽��ϴ�.");
				b2.setEnabled(false);
			}
		});
		//b2.setEnabled(false);	//��ư ��Ȱ��ȭ
		
		c.setBackground(Color.DARK_GRAY);
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GuiEx07();
	}

}
