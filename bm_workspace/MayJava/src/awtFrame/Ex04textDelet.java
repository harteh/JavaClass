package awtFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


class Text implements ActionListener {
	
	JTextArea jt;
	Text(JTextArea jt){
		this.jt = jt;
	};
	
	@Override
	public void actionPerformed(ActionEvent e) {
		jt.setText("������!");
		jt.append("\n���� �Է�: ");
	}
	
}

public class Ex04textDelet {
	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		JTextArea jt = new JTextArea(10, 20);
		jt.append("���� �Է�: ");
		
		JButton b = new JButton("���� ��ư");
		b.addActionListener(new Text(jt));
		//���� ��ư Ŭ�� �� Text(jt)���� �̺�Ʈ �߻�
		
		
		
		//setting
		j.add(jt);
		j.add(b);
		
		j.setSize(500, 350);	    j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
