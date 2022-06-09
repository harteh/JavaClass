package awtFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * �޴�(3��)��ư�� Ŭ���ϸ� �޴��� ���õǰ� * �޴� �ؿ� ������ �ִ�.
 * ���� ������ �����ϴ� (+ -)
 * Ȯ���� Ŭ���ϸ� �ݾ��� ��µȴ�
 */
public class MenuOrder extends JFrame {
	
	//�޴�1 - �Ƹ޸�ī��
	class Menu1 extends Panel {
		
		JButton jbMenu = new JButton("�Ƹ޸�ī��");
		JLabel aPrice = new JLabel("5000��");
		//�� ��������
		String str = aPrice.getText();
		String str1[] = str.split("��");
		int price = Integer.parseInt(str1[0]);
		
		//����
		int cnt = 0;
		//�� ���Ű���
		int sum = 0;
		
		//��������
		JButton jbPlus = new JButton("+");
		JTextField jtA = new JTextField(5);
		JButton jbMinus = new JButton("-");
		
		//Ȯ�ι�ư
		JButton jbConfirm = new JButton("Ȯ��");
		//�� �ݾ� ���
		JTextArea jtPriceSum = new JTextArea(2, 10);
		
		Menu1(){
			//Event
			jbPlus.setEnabled(false);
			jbMinus.setEnabled(false);
			jbMenu.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// Ŭ�� �� �������� ��ư Ȱ��ȭ
					jbPlus.setEnabled(true);
					jbMinus.setEnabled(true);
					// ������ 1�� �������Ѽ� TextField�� ���
					cnt++;
					jtA.setText( Integer.toString(cnt));
				}
			});
			
			//Event
			// ������ư Ŭ������ �� ��ȭ -> jtA�� ���� ���
			jbPlus.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					cnt++;
					jtA.setText( Integer.toString(cnt));
				}
			});
			jbMinus.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					cnt--;
					jtA.setText( Integer.toString(cnt));
				}
			});
			
			//Event
			jbConfirm.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//Ȯ�ι�ư Ŭ�� �� ��ǰ�� ���Ű����� ����Ѵ�
					sum = price * cnt; 
					System.out.println(sum);
					jtPriceSum.setText(
							"�Ƹ޸�ī�� "+cnt+"��\n�� "+sum+"�� \n");
				}
			});
			
			//setting
			add(jbMenu);
			add(aPrice);
			add(jbPlus);
			add(jtA);
			add(jbMinus);
			add(jbConfirm);
			add(jtPriceSum);
			
			setBackground(Color.white);
			jtPriceSum.setBackground(Color.orange);
		}
	}

	//�޴�2 - ī���
	
	
	//��ü
	MenuOrder() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//add Panel
		c.add(new Menu1());
//		c.add(new Menu2());
//		c.add(new Menu3());
		
		
		//setting
		setSize(500, 500);       setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuOrder();
	}
}
