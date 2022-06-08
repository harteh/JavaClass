package guiSearch0615;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

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
		JButton	jb1 = new JButton("입력");
		JButton	jb2 = new JButton("찾기");
		c.add(jb1);
		c.add(jb2);
		
		//입력된 데이터 목록 영역
		JTextArea ja = new JTextArea(15, 20);
		c.add(ja);
		
		HashMap<String, String> h =
				new HashMap<String, String>();
		
		//이벤트처리
		//입력jb1 버튼 클릭 시 jt1와 jt2에 있는 문자세트를 ja 에 추가한다
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				h.put(jt1.getText(), jt2.getText());
				
				ja.append("(삽입) "+jt1.getText() +", "+ jt2.getText()+"\n");
			}
		});
				
		//찾기jb2 버튼 클릭 시 ja 목록에서 jt1에서 입력받은 키에 맞는 값을 jt2에 반환한다.
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				while(true) {
					String schStr = jt1.getText();
					String resultStr = h.get(schStr);
					
					if(resultStr == null) {
						jt2.setText(" ");
						break;
					}
					else {
						jt2.setText(resultStr);
						break;
					}
				}
			}
		});
		
		
		//setting
	    setTitle("Search");
		setSize(300, 400);       setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TextSearch();
	}

}
