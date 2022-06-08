package awtFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{

	Calculator (){
		Container c = getContentPane();
	    
	    JPanel j1 = new JPanel();
	    JPanel j2 = new JPanel();
	    JPanel j3 = new JPanel();
	    
	    j1.setBackground(Color.orange);
	    j2.setLayout(new GridLayout(4,4));
	    j3.setBackground(Color.pink);
	    
	    JLabel jl1 = new JLabel("입력");
	    JTextField jt1 = new JTextField(10);
	    j1.add(jl1);
	    j1.add(jt1);
	    
	    JLabel jl2 = new JLabel("결과");
	    JTextField jt2 = new JTextField(10);
	    j3.add(jl2);
	    j3.add(jt2);
	    
	    //Button
	    for(int i=0; i<16; i++) {
	    	JButton b = new JButton();	//16개의 버튼 생성
	    	String[] s = {
	    			"+","-","*","/","계산","CE"
	    			};
	    	if(i<10) {
	    		b.setText(Integer.toString(i));
	    	}
	    	else {
	    		b.setText(s[i-10]);
	    	}
	    	
	    	j2.add(b);
	    }
	    
		//setting
	    c.add(j1, BorderLayout.NORTH);	//프레임에 파넬부착
	    c.add(j2);
	    c.add(j3, BorderLayout.SOUTH);
	    
	    setTitle("Calculator");
		setSize(400, 450);       setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}
