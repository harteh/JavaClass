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
	
	JRadioButton j1 = new JRadioButton("치킨");
	JRadioButton j2 = new JRadioButton("피자");
	
	GuiEx16() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup b1 = new ButtonGroup();
		
		b1.add(j1);
		b1.add(j2);
		
		//이벤트처리 연결
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
			//라디오버튼 클릭 이벤트
			if(e.getStateChange() != ItemEvent.SELECTED) {
				return;	//선택되어있지 않으면 함수 종료
			}
			
			if(e.getItem() == j1) {
				//치킨 선택 시
				getContentPane().setBackground(Color.gray);
				System.out.println("치킨을 먹는다");
			}
			else if(e.getItem() == j2) {
				getContentPane().setBackground(Color.pink);
				System.out.println("피자를 먹는다");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiEx16();
	}

}
