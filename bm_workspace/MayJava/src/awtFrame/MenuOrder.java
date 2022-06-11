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
 * 메뉴(3개)버튼을 클릭하면 메뉴가 선택되고 * 메뉴 밑에 가격이 있다.
 * 수량 선택이 가능하다 (+ -)
 * 확인을 클릭하면 금액이 출력된다
 */

class MenuPanel extends JPanel {
	int cnt = 0;	int sum = 0;	String menuName =""; int price=0;
	String recSum="";
	
	MenuPanel(String menuName, int price){
		this.menuName=menuName;	this.price=price;
		
		//판설정
		JButton jbMenu = new JButton(menuName);
		JLabel aPrice = new JLabel(price+"원");
		//수량선택
		JButton jbPlus = new JButton("+");
		JTextField jtA = new JTextField(5);
		//텍스트영역 편집 불가
		jtA.setEditable(false);
		JButton jbMinus = new JButton("-");
		//확인버튼
		JButton jbConfirm = new JButton("확인");
		JButton jbCancel = new JButton("취소");
		//메뉴별 총 금액 출력
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
		// 메뉴클릭 시 수량선택, 확인, 취소 버튼 활성화
		jbMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jbPlus.setEnabled(true);
				jbMinus.setEnabled(true);
				jbConfirm.setEnabled(true);
				jbCancel.setEnabled(true);
				// 수량을 1로 증가시켜서 TextField에 출력
					cnt++;
					jtA.setText( Integer.toString(cnt));
			}
		});
		
		//Event
		// 수량버튼 클릭으로 값 변화 -> jtA에 가격 출력
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
				else {	//수량 음수 금지
					jbMinus.setEnabled(false);
				}
			}
		});
		
		//Event
		//확인버튼 클릭 시 상품의 구매가격을 출력한다
		jbConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum = price * cnt;
				recSum = "  "+menuName+" "+cnt+"잔  "+sum+"원 \n"; 
				jtPriceSum.setText(recSum);
			}
		});
		//Event
		//취소버튼 클릭 시 구매가격, 수량 초기화
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

	//전체
	MenuOrder() {		
		Container c = getContentPane();
		c.setLayout(null);
		
		//메뉴 생성
		MenuPanel mp1 = new MenuPanel("아메리카노", 5000);
		MenuPanel mp2 = new MenuPanel("카페라떼", 5500);
		MenuPanel mp3 = new MenuPanel("카푸치노", 6000);
		
		//폰트와 여백설정
		Border emptyBorder = BorderFactory.createEmptyBorder(30,50,10,10);
		
		//영수증 버튼
		JButton jbRecSum = new JButton("영수증 출력");
		//주문취소 버튼
		JButton jbOrderCancle = new JButton("취소");
		
		//총 금액 영수증 출력
		JTextArea jtReceipt = new JTextArea(10, 20);
		jtReceipt.setEditable(false);
		jtReceipt.setBackground(Color.PINK);
		jtReceipt.setBorder(emptyBorder);
		
		
		//영수증출력 EVENT
		jbRecSum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭하면 전체 주문 금액을 영수증에 출력한다
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
		//주문취소 event
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
		//창 사이즈 변경 불가
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MenuOrder();
	}
}
