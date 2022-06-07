package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MouseEx10 extends MouseAdapter {
	public void mouseEntered(MouseEvent e) {
		JLabel j = (JLabel) e.getSource();	//�̺�Ʈ �߻���õ
		j.setText("��Ծ�");	//���ڿ� ����
		
	}
	
	public void mouseExited(MouseEvent e) {
		JLabel j = (JLabel) e.getSource();
		j.setText("�ڹٴ�");
		
	}
}


public class GuiEx10JLabel extends JFrame {
	
	GuiEx10JLabel(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel("�ڹٴ�");
		j.addMouseListener(new MouseEx10());
		
		
		
		c.add(j);
		
		setSize(500, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiEx10JLabel();
	}

}
