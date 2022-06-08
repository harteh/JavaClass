package guiSearch0615;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextSearch extends JFrame {

	TextSearch(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//영어검색 영역
		JLabel jl1 = new JLabel("영어");
		JTextField jt1 = new JTextField(10);
		c.add(jl1);
		c.add(jt1);
		
		//한글검색 영역
		JLabel jl2 = new JLabel("한글");
		JTextField jt2 = new JTextField(10);
		c.add(jl2);
		c.add(jt2);
		
		//버튼 영역
		JButton	jb1 = new JButton("삽입");
		JButton	jb2 = new JButton("찾기");
		c.add(jb1);
		c.add(jb2);
		
		//입력된 데이터 목록 영역
		JTextArea ja = new JTextArea(15, 20);
		c.add(ja);
		
		
		
		
		//setting
	    setTitle("Search");
		setSize(300, 400);       setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TextSearch();
	}

}
