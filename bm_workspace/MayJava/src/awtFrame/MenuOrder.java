package awtFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 * �޴�(3��)��ư�� Ŭ���ϸ� �޴��� ���õǰ� * �޴� �ؿ� ������ �ִ�.
 * ���� ������ �����ϴ� (+ -)
 * Ȯ���� Ŭ���ϸ� �ݾ��� ��µȴ�
 */

class MenuPanel extends JPanel {
	int cnt = 0;	int sum = 0;	String menuName =""; int price=0;
	String recSum="";
	
	MenuPanel(String menuName, int price){
		this.menuName=menuName;	this.price=price;
		
		//�Ǽ���
		JButton jbMenu = new JButton(menuName);
		JLabel aPrice = new JLabel(price+"��");
		//��������
		JButton jbPlus = new JButton("+");
		JTextField jtA = new JTextField(5);
		//�ؽ�Ʈ���� ���� �Ұ�
		jtA.setEditable(false);
		JButton jbMinus = new JButton("-");
		//Ȯ�ι�ư
		JButton jbConfirm = new JButton("Ȯ��");
		JButton jbCancel = new JButton("���");
		//�޴��� �� �ݾ� ���
		JTextArea jtPriceSum = new JTextArea(2, 15);

		Border emptyBorder = BorderFactory.createEmptyBorder(15,7,5,5);
		jtPriceSum.setBorder(emptyBorder);
		//setting
		add(jbMenu);
		add(aPrice);
		add(jbPlus);
		add(jtA);
		add(jbMinus);
		add(jbConfirm);
		add(jbCancel);
		add(jtPriceSum);
		
		setBackground(Color.WHITE);
		jtPriceSum.setBackground(Color.getHSBColor(348, 18, 79));

		//Event
		jbPlus.setEnabled(false);
		jbMinus.setEnabled(false);
		jbConfirm.setEnabled(false);
		jbCancel.setEnabled(false);
		// �޴�Ŭ�� �� ��������, Ȯ��, ��� ��ư Ȱ��ȭ
		jbMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jbPlus.setEnabled(true);
				jbMinus.setEnabled(true);
				jbConfirm.setEnabled(true);
				jbCancel.setEnabled(true);
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
				jbMinus.setEnabled(true);
			}
		});
		jbMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cnt > 0) {
					cnt--;
					jtA.setText( Integer.toString(cnt));
				}
				else {	//���� ���� ����
					jbMinus.setEnabled(false);
				}
			}
		});
		
		//Event
		//Ȯ�ι�ư Ŭ�� �� ��ǰ�� ���Ű����� ����Ѵ�
		jbConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum = price * cnt;
				recSum = "  "+menuName+" "+cnt+"��  "+sum+"�� \n"; 
				jtPriceSum.setText(recSum);
			}
		});
		//Event
		//��ҹ�ư Ŭ�� �� ���Ű���, ���� �ʱ�ȭ
		jbCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt = 0;	sum = 0;
				recSum="";
				jtA.setText("");
				jtPriceSum.setText("");
				jbPlus.setEnabled(false);
				jbMinus.setEnabled(false);
				jbConfirm.setEnabled(false);
				jbCancel.setEnabled(false);
			}
		});
	}
}

public class MenuOrder extends JFrame {

	//��ü
	MenuOrder() {		
		Container c = getContentPane();
		c.setLayout(null);
		
		//�޴� ����
		MenuPanel mp1 = new MenuPanel("�Ƹ޸�ī��", 5000);
		MenuPanel mp2 = new MenuPanel("ī���", 5500);
		MenuPanel mp3 = new MenuPanel("īǪġ��", 6000);
		
		//��Ʈ�� ���鼳��
		Border emptyBorder = BorderFactory.createEmptyBorder(30,50,10,10);
		
		//������ ��ư
		JButton jbRecSum = new JButton("������ ���");
		//�ֹ���� ��ư
		JButton jbOrderCancle = new JButton("���");
		
		//�� �ݾ� ������ ���
		JTextArea jtReceipt = new JTextArea(10, 20);
		jtReceipt.setEditable(false);
		jtReceipt.setBackground(Color.PINK);
		jtReceipt.setBorder(emptyBorder);
		
		
		//��������� EVENT
		jbRecSum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ���ϸ� ��ü �ֹ� �ݾ��� �������� ����Ѵ�
				int totalSum = mp1.sum+mp2.sum+mp3.sum;
				String receiptText = 
						"��ü �ֹ� ����\n"+
						mp1.recSum+
						mp2.recSum+
						mp3.recSum+
						"\n�����Ͻ� �ݾ��� "+totalSum+"�� �Դϴ�";
				jtReceipt.setText(receiptText);
			}
		});
		//�ֹ���� event
		jbOrderCancle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtReceipt.setText("");
			}
		});
		
		
		//add Panel
		c.add(mp1);
		c.add(mp2);
		c.add(mp3);
		c.add(jbRecSum);
		c.add(jbOrderCancle);
		c.add(jtReceipt);
		
		//size setting
		mp1.setBounds(20, 20, 150, 160);
		mp2.setBounds(180, 20, 150, 160);
		mp3.setBounds(340, 20, 150, 160);
		jbRecSum.setBounds(100, 200, 250, 50);
		jbOrderCancle.setBounds(360, 200, 60, 50);
		jtReceipt.setBounds(100, 270, 320, 250);
		
		//setting
		setLocation(400, 200);
		setSize(520, 600);       setVisible(true);
		//â ������ ���� �Ұ�
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuOrder();
	}
}
