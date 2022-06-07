package awtFrame;

import javax.swing.JFrame;

public class Frame02 {
	public static void main(String[] args) {
		
		JFrame fr = new JFrame("두번째");
		fr.setSize(400, 400);		//사이즈
		fr.setLocation(800, 100);	//좌표
		
		//x버튼으로 프레임 닫기
		//프레임이 닫힐 때 아예 메모리에서 없어져라
		//이 기능은 JFrame에서만 사용 가능하며 일반 Frame에서는 사용불가
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		
		//여러개의 프레임 중 원하는 하나의 프레임만 종료하고자 한다면 dispose()
		//열려있는 프레임의 수와 상관없이 강제로 VM을 종료하려면 System.exit(0)
		//fr.dispose();
		
	}
}
