package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * GUI (graphic user interface)
 * JFrame을 상속받아 만든다.
 * 
 * 배치관리자
 * 	- 종류: 
 * 		FlowLayout(): 순서대로(왼쪽에서 오른족으로 컴포넌트 배치)
 * 		BorderLayout(): 동,서,남,북,중앙
 * 		GridLayout(): 2차원
 * 		CardLayout(): 카드 쌓아놓듯이 포개어 배치
 *  
 */
public class GuiEx01 extends JFrame {
	//JFrame을 상속받아 만든다.
	
	GuiEx01() {
		super("Java");	//제목설정 - 부모생성자(JFrame) 호출
		setSize(300, 300);	//프레임크기 설정
		setVisible(true);	//프레임 출력 메서드
		
		JButton j1 = new JButton("버튼1");
		JButton j2 = new JButton("버튼2");
		JButton j3 = new JButton("버튼3");
		
		Container c = getContentPane();
		//컨텐트팬을 알아낸다. -윈도우창의 회색부분의 범위..
		c.add(j1);
		c.add(j2);
		c.add(j3);
		
		c.setLayout(new FlowLayout());
		//배치관리자 > 순서대로 배치
		
	}
	
	public static void main(String[] args) {

		new GuiEx01();
		
	}
}
