package awtFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * 1 JTextField������� id, pw������ֵ��Ϸα���â��������.
	(��enter�����Է��ϴ¼��� id����µȴ�.)
 */
public class Ex08 extends JFrame{
	
	Ex08(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

	    c.add(new JLabel("id   "));
		JTextField j1 = new JTextField(20);
		c.add(j1);
		
		c.add(new JLabel("pw   "));
//		JTextField j2 = new JTextField(20);
		JPasswordField j2 = new JPasswordField(20);
		c.add(j2);
		
		
		//�̺�Ʈó��
		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String n = j1.getText();
				System.out.println(n);
			}
		});
		j2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				String n = j2.getText();
				char[] n = j2.getPassword();
				System.out.println(n);
			}
		});
		

		//setting
		
		setTitle("login");
		setSize(500, 350);	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new Ex08();
	}
}
