package guiAddrFile;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 이름, 나이, 주소, 전화번호를 입력받는다
 * [추가] 버튼으로 입력받은 값을 저장하여 명단을 만들고,
 * 		화면 하단에 명단을 출력한다
 * [파일저장] 버튼 클릭하면 만들어진 명단을 파일로 출력한다
 * [파일가져오기] 버튼 클릭하면 저장되어있던 명단 파일을 불러와, 화면에 출력한다.
 *
 */
public class AddrList extends JFrame{
	
	AddrList(){
		Container c = getContentPane();
		c.setLayout(null);
		
		//add data
		JLabel jlName = new JLabel("이름:  ");
		JTextField jtName = new JTextField(10);
		JLabel jlAge = new JLabel("나이:  ");
		JTextField jtAge = new JTextField(10);
		JLabel jlPhone = new JLabel("전화번호:  ");
		JTextField jtPhone = new JTextField(10);
		JLabel jlAddr = new JLabel("주소:  ");
		JTextField jtAddr = new JTextField(10);
		
		JButton jbAddList = new JButton("사람추가");
		JButton jbOsFile = new JButton("파일만들기");
		JButton jbIsFile = new JButton("파일불러오기");
		
		JLabel jlState = new JLabel("입력,출력 상태에 따른 공지를 알려준다 - 삭제될 안내글");
		
		JTextArea jtaList = new JTextArea(20,20);
		
		
		jtaList.setBackground(Color.red);
		//add container
		c.add(jlName);		c.add(jtName);
		c.add(jlAge);		c.add(jtAge);
		c.add(jlPhone);		c.add(jtPhone);
		c.add(jlAddr);		c.add(jtAddr);
		
		c.add(jbAddList);
		c.add(jbOsFile);
		c.add(jbIsFile);
		
		c.add(jlState);
		c.add(jtaList);
		
		//set location
		jlName.setBounds(120,20,150,30);
		jtName.setBounds(200,20,150,30);
		
		jlAge.setBounds(120,60,150,30);
		jtAge.setBounds(200,60,150,30);
		
		jlPhone.setBounds(120,100,150,30);
		jtPhone.setBounds(200,100,150,30);
		
		jlAddr.setBounds(120,140,150,30);
		jtAddr.setBounds(200,140,150,30);
		
		jbAddList.setBounds(80,200,110,40);
		jbOsFile.setBounds(200,200,110,40);
		jbIsFile.setBounds(320,200,110,40);
		
		jlState.setBounds(120,250,300,30);
		jtaList.setBounds(80,300,350,400);
		
		
		//setting
		setTitle("ADDRESS LIST");
		setLocation(800, 100);
		setSize(520, 800); setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new AddrList();
	}
}
