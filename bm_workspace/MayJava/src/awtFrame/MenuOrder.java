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

class MenuPanel extends JPanel {
	int cnt = 0;	int sum = 0;	
    String menuName =""; int price=0;
	String recSum="";
	
	MenuPanel(String menuName, int price){
		this.menuName=menuName;	this.price=price;
		
		JButton jbMenu = new JButton(menuName);
		JLabel aPrice = new JLabel(price+"원");
		JButton jbPlus = new JButton("+");
		JTextField jtA = new JTextField(5);
		jtA.setEditable(false);
		JButton jbMinus = new JButton("-");
		JButton jbConfirm = new JButton("확인");
		JButton jbCancel = new JButton("취소");
		JTextArea jtPriceSum = new JTextArea(2, 15);

		Border emptyBorder = BorderFactory.createEmptyBorder(15,7,5,5);
		jtPriceSum.setBorder(emptyBorder);
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

		jbPlus.setEnabled(false);
		jbMinus.setEnabled(false);
		jbConfirm.setEnabled(false);
		jbCancel.setEnabled(false);
		jbMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jbPlus.setEnabled(true);
				jbMinus.setEnabled(true);
				jbConfirm.setEnabled(true);
				jbCancel.setEnabled(true);
					cnt++;
					jtA.setText( Integer.toString(cnt));
			}
		});
		
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
				else {
					jbMinus.setEnabled(false);
				}
			}
		});
		
		jbConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum = price * cnt;
				recSum = "  "+menuName+" "+cnt+"잔  "+sum+"원 \n"; 
				jtPriceSum.setText(recSum);
			}
		});
		//Event
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
	MenuOrder() {		
		Container c = getContentPane();
		c.setLayout(null);
		
		MenuPanel mp1 = new MenuPanel("아메리카노", 5000);
		MenuPanel mp2 = new MenuPanel("카페라떼", 5500);
		MenuPanel mp3 = new MenuPanel("카푸치노", 6000);
		
		Border emptyBorder = BorderFactory.createEmptyBorder(30,50,10,10);
		
		JButton jbRecSum = new JButton("영수증 출력");
		JButton jbOrderCancle = new JButton("취소");
		
		JTextArea jtReceipt = new JTextArea(10, 20);
		jtReceipt.setEditable(false);
		jtReceipt.setBackground(Color.PINK);
		jtReceipt.setBorder(emptyBorder);
		
		jbRecSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int totalSum = mp1.sum+mp2.sum+mp3.sum;
				String receiptText = 
						"전체 주문 내역\n"+
						mp1.recSum+
						mp2.recSum+
						mp3.recSum+
						"\n결제하실 금액은 "+totalSum+"원 입니다";
				jtReceipt.setText(receiptText);
			}
		});
		jbOrderCancle.addActionListener(new ActionListener() {
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
		
		mp1.setBounds(20, 20, 150, 160);
		mp2.setBounds(180, 20, 150, 160);
		mp3.setBounds(340, 20, 150, 160);
		jbRecSum.setBounds(100, 200, 250, 50);
		jbOrderCancle.setBounds(360, 200, 60, 50);
		jtReceipt.setBounds(100, 270, 320, 250);
		
		setLocation(400, 200);
		setSize(520, 600);       setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuOrder();
	}
}