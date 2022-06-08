package awtFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/*
 * File 메뉴에 메뉴 아이템 세개를 만들어라.(Load, Hide, Exit)
	Load를 선택하면 이미지(사진)을 띄우고, 
	Hide를 선택하면 이미지를 보이지않게한다. 
	Exit을 선택하면 프로그램을 종료하도록 작성해라.
 */
public class Ex11file extends JFrame{
	Ex11file(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel l1=new JLabel();
		c.add(l1);
		
		JMenuBar mb1=new JMenuBar();
		JMenu m1=new JMenu("File");
		JMenuItem mi1=new JMenuItem("Load");
		JMenuItem mi2=new JMenuItem("Hide");
		JMenuItem mi3=new JMenuItem("Exit");
		setJMenuBar(mb1);
		
		mb1.add(m1);
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		
		mi1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon ii=new ImageIcon
				("E://26.newJava/pizza.JPG");
				l1.setIcon(ii);
			}
		});
		mi2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.hide();
			}
		});
		mi3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		//setting
		c.add(mb1);
	    setTitle("File");
		setSize(400, 450);       setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex11file();
	}
}
