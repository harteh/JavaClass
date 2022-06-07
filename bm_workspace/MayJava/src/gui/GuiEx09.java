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
		// 드래그 시 배경색변경 이벤트 발생
		Container c = (Container) e.getSource();	//이벤트가 일어난 원천 알아내기
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
		
		c.setBackground(Color.pink);	//배경색 지정
		
		c.addMouseMotionListener(new Mouse0607());	//마우스 클릭
		c.addMouseListener(new Mouse0607());	//마우스 놨을 때

		
		setSize(500, 350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiEx09();
	}
}
