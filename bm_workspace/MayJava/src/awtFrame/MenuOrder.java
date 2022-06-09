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
		
		//����
		int cnt = 0;
		//�� ���Ű���
		int sum = 0;
		String menuName ="";
		
		Menu1(String menuName, int price){
			JButton jbMenu = new JButton(menuName);
			JLabel aPrice = new JLabel(price+"��");
			
			//��������
			JButton jbPlus = new JButton("+");
			JTextField jtA = new JTextField(5);
			JButton jbMinus = new JButton("-");
			
			//Ȯ�ι�ư
			JButton jbConfirm = new JButton("Ȯ��");
			//�� �ݾ� ���
			JTextArea jtPriceSum = new JTextArea(2, 10);
			
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
							menuName+" "+cnt+"��\n�� "+sum+"�� \n");
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
	class Menu2 extends Panel {
		
		//����
		int cnt = 0;
		//�� ���Ű���
		int sum = 0;
		String menuName ="";
		
		Menu2(String menuName, int price){
			JButton jbMenu = new JButton(menuName);
			JLabel aPrice = new JLabel(price+"��");
			
			//��������
			JButton jbPlus = new JButton("+");
			JTextField jtA = new JTextField(5);
			JButton jbMinus = new JButton("-");
			
			//Ȯ�ι�ư
			JButton jbConfirm = new JButton("Ȯ��");
			//�� �ݾ� ���
			JTextArea jtPriceSum = new JTextArea(2, 10);
			
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
							menuName+" "+cnt+"��\n�� "+sum+"�� \n");
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
	
	//�޴�3 - īǪġ��
	class Menu3 extends Panel {
		
		//����
		int cnt = 0;
		//�� ���Ű���
		int sum = 0;
		String menuName ="";
		
		Menu3(String menuName, int price){
			JButton jbMenu = new JButton(menuName);
			JLabel aPrice = new JLabel(price+"��");
			
			//��������
			JButton jbPlus = new JButton("+");
			JTextField jtA = new JTextField(5);
			JButton jbMinus = new JButton("-");
			
			//Ȯ�ι�ư
			JButton jbConfirm = new JButton("Ȯ��");
			//�� �ݾ� ���
			JTextArea jtPriceSum = new JTextArea(2, 10);
			
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
							menuName+" "+cnt+"��\n�� "+sum+"�� \n");
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
	
	//��ü
	MenuOrder() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//add Panel
		c.add(new Menu1("�Ƹ޸�ī��", 5000));
		c.add(new Menu2("ī���", 5500));
		c.add(new Menu3("īǪġ��", 6000));
		
		
		//setting
		setSize(500, 500);       setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuOrder();
	}
}
