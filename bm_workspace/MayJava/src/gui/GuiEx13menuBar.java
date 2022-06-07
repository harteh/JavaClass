package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GuiEx13menuBar extends JFrame{
	GuiEx13menuBar() {
		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
		
		//1. bar ����
		JMenuBar jb = new JMenuBar();
		
		//2. �޴� ����
		JMenu j1 = new JMenu("File");
		JMenu j2 = new JMenu("Edit");
		JMenu j3 = new JMenu("Source");

		//3. ����޴� ����
		JMenuItem j4 = new JMenuItem("new");
		JMenuItem j5 = new JMenuItem("Undo Typing");
		JMenuItem j6 = new JMenuItem("Redo");
		
		//4. setting menuBar
		setJMenuBar(jb);
		
		//5. add
		jb.add(j1);
		jb.add(j2);
		jb.add(j3);
		
		j1.add(j4);
		j2.add(j5);
		j2.add(j6);
		
		
		//6. �̺�Ʈ ó��
		j4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// j4 �޴� Ŭ�� �� �̺�Ʈ
				System.out.println("create new File");
			}
		});
		
		
		
		
		setSize(600, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GuiEx13menuBar();
	}

}
