package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

class MouseEx20 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton j1 = (JButton) e.getSource();
		j1.setText("버튼이 바뀜");
	}
}

public class GuiEx20 extends JFrame {
	GuiEx20 (){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton j1 = new JButton("버튼 1");
		
		// 방법1
		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				j1.setBackground(Color.CYAN);
			}
		});
		
		//방법 2
		j1.addActionListener(new MouseEx20());
		
		//방법 3
		j1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				c.setBackground(Color.ORANGE);
			}
		});
		
		//setting
		c.add(j1);
		setSize(500, 350);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GuiEx20();
	}

}
