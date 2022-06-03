package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
class My implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();	//이벤트가 어디서 발생했는지.
		
		if(b.getText().equals("클릭") ) {
			b.setText("click");
		}
		else {
			b.setText("클릭");
		}
	}
}
*/

public class GuiEx06ActionListener extends JFrame{
	
	GuiEx06ActionListener(){
		super("버튼 내용 변경");
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JButton j1 = new JButton("클릭");
		
		//j1.addActionListener(new My());	
		//연결 Action이벤트 리스너 달기
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();	//이벤트가 어디서 발생했는지.
				
				if(b.getText().equals("클릭") ) {
					b.setText("click");
				}
				else {
					b.setText("클릭");
				}
			}
		});	
		
		c.add(j1);
		
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GuiEx06ActionListener();
	}
}
