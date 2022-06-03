package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * GUI (graphic user interface)
 * JFrame�� ��ӹ޾� �����.
 * 
 * ��ġ������
 * 	- ����: 
 * 		FlowLayout(): �������(���ʿ��� ���������� ������Ʈ ��ġ)
 * 		BorderLayout(): ��,��,��,��,�߾�
 * 		GridLayout(): 2����
 * 		CardLayout(): ī�� �׾Ƴ����� ������ ��ġ
 *  
 */
public class GuiEx01 extends JFrame {
	//JFrame�� ��ӹ޾� �����.
	
	GuiEx01() {
		super("Java");	//������ - �θ������(JFrame) ȣ��
		setSize(300, 300);	//������ũ�� ����
		setVisible(true);	//������ ��� �޼���
		
		JButton j1 = new JButton("��ư1");
		JButton j2 = new JButton("��ư2");
		JButton j3 = new JButton("��ư3");
		
		Container c = getContentPane();
		//����Ʈ���� �˾Ƴ���. -������â�� ȸ���κ��� ����..
		c.add(j1);
		c.add(j2);
		c.add(j3);
		
		c.setLayout(new FlowLayout());
		//��ġ������ > ������� ��ġ
		
	}
	
	public static void main(String[] args) {

		new GuiEx01();
		
	}
}
