package awtFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


class Text implements ActionListener {
	
	JTextArea jt;
	Text(JTextArea jt){
		this.jt = jt;
	};
	
	@Override
	public void actionPerformed(ActionEvent e) {
		jt.setText("삭제됨!");
		jt.append("\n내용 입력: ");
	}
	
}

public class Ex04textDelet {
	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		JTextArea jt = new JTextArea(10, 20);
		jt.append("내용 입력: ");
		
		JButton b = new JButton("삭제 버튼");
		b.addActionListener(new Text(jt));
		//삭제 버튼 클릭 시 Text(jt)에서 이벤트 발생
		
		
		
		//setting
		j.add(jt);
		j.add(b);
		
		j.setSize(500, 350);	    j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
