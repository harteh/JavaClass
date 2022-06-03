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
		JButton b = (JButton) e.getSource();	//�̺�Ʈ�� ��� �߻��ߴ���.
		
		if(b.getText().equals("Ŭ��") ) {
			b.setText("click");
		}
		else {
			b.setText("Ŭ��");
		}
	}
}
*/

public class GuiEx06ActionListener extends JFrame{
	
	GuiEx06ActionListener(){
		super("��ư ���� ����");
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JButton j1 = new JButton("Ŭ��");
		
		//j1.addActionListener(new My());	
		//���� Action�̺�Ʈ ������ �ޱ�
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();	//�̺�Ʈ�� ��� �߻��ߴ���.
				
				if(b.getText().equals("Ŭ��") ) {
					b.setText("click");
				}
				else {
					b.setText("Ŭ��");
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
