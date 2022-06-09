package awtFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class  Ex13changeColor extends JFrame{
	   
	Ex13changeColor(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 3));
		
		JLabel[] j1 = new JLabel[12];
		for(int i=0; i<j1.length; i++) {
			j1[i] = new JLabel("java");
			c.add(j1[i]);
			
			//클릭시 색을 랜덤하게 변경
			j1[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JLabel la = (JLabel) e.getSource();
					
					int r = (int)(Math.random()*256);
					int g = (int)(Math.random()*256);
					int b = (int)(Math.random()*256);
					
					la.setOpaque(true);	//투명도 설정
					la.setBackground(new Color(r,g,b));
					
				}//mouseClicked end
			});//addMouseListener end
		}//for end
		

		//setting
		c.setBackground(Color.WHITE);
		setSize(500, 350);       setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }
   
	public static void main(String[] args) {
		new Ex13changeColor();
	}
}
