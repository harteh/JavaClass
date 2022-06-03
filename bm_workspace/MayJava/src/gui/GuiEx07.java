package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiEx07 extends JFrame {
	
	GuiEx07(){
		super("버튼?");
		
		JButton b1 = new JButton("ok");
		JButton b2 = new JButton("cancel");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(b1);
		c.add(b2);
		
		//ok 버튼 클릭 시 이벤트 처리
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("승인되었습니다.");
				
				b2.setEnabled(true);	//버튼 활성화
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("취소했습니다.");
				b2.setEnabled(false);
			}
		});
		//b2.setEnabled(false);	//버튼 비활성화
		
		c.setBackground(Color.DARK_GRAY);
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GuiEx07();
	}

}
