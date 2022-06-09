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
 * 메뉴(3개)버튼을 클릭하면 메뉴가 선택되고 * 메뉴 밑에 가격이 있다.
 * 수량 선택이 가능하다 (+ -)
 * 확인을 클릭하면 금액이 출력된다
 */
public class MenuOrder extends JFrame {
	
	//메뉴1 - 아메리카노
	class Menu1 extends Panel {
		
		JButton jbMenu = new JButton("아메리카노");
		JLabel aPrice = new JLabel("5000원");
		//값 가져오기
		String str = aPrice.getText();
		String str1[] = str.split("원");
		int price = Integer.parseInt(str1[0]);
		
		//수량
		int cnt = 0;
		//총 구매가격
		int sum = 0;
		
		//수량선택
		JButton jbPlus = new JButton("+");
		JTextField jtA = new JTextField(5);
		JButton jbMinus = new JButton("-");
		
		//확인버튼
		JButton jbConfirm = new JButton("확인");
		//총 금액 출력
		JTextArea jtPriceSum = new JTextArea(2, 10);
		
		Menu1(){
			//Event
			jbPlus.setEnabled(false);
			jbMinus.setEnabled(false);
			jbMenu.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭 시 수량선택 버튼 활성화
					jbPlus.setEnabled(true);
					jbMinus.setEnabled(true);
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
					//확인버튼 클릭 시 상품의 구매가격을 출력한다
					sum = price * cnt; 
					System.out.println(sum);
					jtPriceSum.setText(
							"아메리카노 "+cnt+"잔\n총 "+sum+"원 \n");
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

	//메뉴2 - 카페라떼
	
	
	//전체
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
