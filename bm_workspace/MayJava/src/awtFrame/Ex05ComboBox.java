package awtFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex05ComboBox extends JFrame {
	
	String[] s = {"피자", "버거"};
	
	ImageIcon[] im = {
			new ImageIcon("E://26.newJava/pizza.JPG"),
			new ImageIcon("E://26.newJava/burger.JPG")
			};

	//ImageIcon 은 JLabel에 부착!
	JLabel j = new JLabel(im[0]);
	
	
	Ex05ComboBox(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox com = new JComboBox(s);
		//콤보박스 선택 시 사진 변경되는 이벤트
		
		com.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox c = (JComboBox) e.getSource();
				int i = c.getSelectedIndex();
				
				j.setIcon(im[i]);
			}
		});
		
		
		//setting
		c.add(j);
		c.add(com);
		
		setSize(500, 350);	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex05ComboBox();
	}
}
