package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class GuiEx16  extends JFrame {
	
	JRadioButton j1 = new JRadioButton("ġŲ");
	JRadioButton j2 = new JRadioButton("����");
	
	GuiEx16() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup b1 = new ButtonGroup();
		
		b1.add(j1);
		b1.add(j2);
		
		//�̺�Ʈó�� ����
		A a = new A();
		j1.addItemListener(a);
		j2.addItemListener(a);
		
		c.add(j1);
		c.add(j2);
		
		setSize(500, 350);
		setVisible(true);
	}
	
	class A implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			//������ư Ŭ�� �̺�Ʈ
			if(e.getStateChange() != ItemEvent.SELECTED) {
				return;	//���õǾ����� ������ �Լ� ����
			}
			
			if(e.getItem() == j1) {
				//ġŲ ���� ��
				getContentPane().setBackground(Color.gray);
				System.out.println("ġŲ�� �Դ´�");
			}
			else if(e.getItem() == j2) {
				getContentPane().setBackground(Color.pink);
				System.out.println("���ڸ� �Դ´�");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiEx16();
	}

}
