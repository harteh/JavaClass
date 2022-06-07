package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class Mouse0607 extends MouseAdapter implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		// �巡�� �� �������� �̺�Ʈ �߻�
		Container c = (Container) e.getSource();	//�̺�Ʈ�� �Ͼ ��õ �˾Ƴ���
		c.setBackground(Color.orange);
	}

	@Override
	public void mouseMoved(MouseEvent e) {}

	
	public void mouseReleased(MouseEvent e){
		Container c = (Container) e.getSource();
		c.setBackground(Color.pink);
	}
	
}

public class GuiEx09 extends JFrame {
	
	GuiEx09(){
		super("mouseMotion");
		Container c = getContentPane();
		
		c.setBackground(Color.pink);	//���� ����
		
		c.addMouseMotionListener(new Mouse0607());	//���콺 Ŭ��
		c.addMouseListener(new Mouse0607());	//���콺 ���� ��

		
		setSize(500, 350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiEx09();
	}
}
