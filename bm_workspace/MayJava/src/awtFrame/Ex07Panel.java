package awtFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 패널은 프레임 안으로 들어갈 것이기 때문에 프레임 크기를 넘어갈 수 없다
 * ** setBounds ** 
 */
public class  Ex07Panel extends JFrame{
	
	Ex07Panel(){
		Container c = getContentPane();
		setTitle("다이어로그");
		
		//add Panel class
		c.add(new Dia(), BorderLayout.NORTH); 
		

		//setting
		setSize(500, 350);	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class Dia extends Panel {
		JButton j = new JButton("이름입력");
		JTextField j1 = new JTextField(10);
		
		JButton j2 = new JButton("확인");
		JButton j3 = new JButton("메시지");
		
		Dia(){
			setBackground(Color.orange);
			add(j);
			add(j1);
			add(j2);
			add(j3);
			
			j.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// input name event
					String name =
							JOptionPane.showInputDialog("이름 입력");	//popUp
					if(name != null) {
						//이름을 입력 했다면
						j1.setText(name);	//입력받은 값을 textFiled 에 반환
					}
				}
			});
			
			j2.addActionListener(new ActionListener() {
				//확인 버튼 클릭이벤트
				@Override
				public void actionPerformed(ActionEvent e) {
					int r = JOptionPane.showConfirmDialog(null, "계속?",
							"확인", JOptionPane.YES_NO_OPTION);
					
					if(r == JOptionPane.CLOSED_OPTION) {	
						//선택하지 않고 창을 닫으면,
						j1.setText("선택하지않았다");
					}
					else if(r == JOptionPane.YES_OPTION){
						j1.setText("네");
					}
					else{
						j1.setText("아니오");
					}
				}
			});
			
			j3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog
					(null, "경고", "메시지", JOptionPane.WARNING_MESSAGE);
				}
			});
			
		}
		
	}
	
	public static void main(String[] args) {
		new Ex07Panel();
	}
}
