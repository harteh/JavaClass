package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class GuiEx15jRadioButton extends JFrame {
	GuiEx15jRadioButton(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//�ϳ��� �����ϱ� ���� ��ư �׷��� �ʿ�
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton j = new JRadioButton("�ڹ�");
		JRadioButton j1 = new JRadioButton("DB");
		JRadioButton j2 = new JRadioButton("C+");
		
		//��ư �׷쿡 ����
		g.add(j);
		g.add(j1);
		g.add(j2);
		
		c.add(j);
		c.add(j1);
		c.add(j2);
		
		setSize(600, 550);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiEx15jRadioButton();
	}
}
