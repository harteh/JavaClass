package gui;

/**
 *	이벤트 처리
 * - ActionListener(인터페이스)
 * 		(actionPerformed)
 * 	: JButton, JMenuItem, JTextField
 * 
 * - MouseListener -> MouseAdapter
 * 		단점: 추상메서드 전부 가져와서 구현해야한다. -> MouseAdapter 로 보완
 * 
 * - MouseMotionListener
 * 
 *  
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiEx08mouseMotion extends JFrame {
		
	GuiEx08mouseMotion(){
		super("mouseMotion");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		
		j1.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println( e.getX()+" "+e.getY() );
			}
		});
		
		
		
		
		c.add(j1);
		c.add(j2);
		
		setSize(500, 300);
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		new GuiEx08mouseMotion();	//생성자 호출
	}

}
