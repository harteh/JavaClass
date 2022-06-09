package awtFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex14 extends JFrame {
	JButton j = new JButton("Cal");
	JLabel j1 = new JLabel("계산결과");
	
	Ex14(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j1);
		c.add(j);
		
		j.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Aa a = new Aa();	//JDialog
				a.setVisible(true);	//다이어로그
				a.setSize(200, 200);
			}
		});
		
		//setting
		setSize(300, 200);       setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class Aa extends JDialog {
		JTextField f1 = new JTextField(15);
		JTextField f2 = new JTextField(15);
		
		JButton j2 = new JButton("ADD");
		
		Aa() {
			setLayout(new FlowLayout());
			add(new JLabel("두 수를 더합니다"));
			add(f1);
			add(f2);
			add(j2);

			//ADD 버튼 클릭 이벤트
			j2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);	//다이어로그창은 종료
					
					int num1 = Integer.parseInt(f1.getText());
					int num2 = Integer.parseInt(f2.getText());
					int sum= num1+num2;
					
//					j1.setText(sum+"");
					j1.setText( Integer.toString(sum) );
				}
			});
		}
	}
	
	public static void main(String[] args) {
		new Ex14();
	}
}
