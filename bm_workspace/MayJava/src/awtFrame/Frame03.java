package awtFrame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame03 {
	public static void main(String[] args) {
		/*
		 * 화면 중앙에 프레임 위치 시키기
		 	1. 실행 중인 모니터의 해상도를 알아야한다.
		 	2. 모니터의 중앙 좌표를 알아 놓은 후
		 	3. 프레임 좌우 크기를 중앙 좌표에서 빼줘야 한다.
		 		awt.Toolkit <- 싱글톤
		 		Toolkit beep()
		 			get모니터사이즈() <- !!! width height 값!@
		 		x: 모니터 중앙 좌표값 - 내가 만들려는 프레임의 width/2
		 		y: 모니터 중앙 좌표값 - 내가 만들려는 프레임의 height/2
		 */
		
		JFrame fr = new JFrame("세번째");
		fr.setSize(400, 400);
		
		//Toolkit을 통해 모니터 해상도 얻어오기
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i=0; i<3; i++) {
			try {Thread.sleep(1000); } catch (Exception e) {}
			tk.beep();	//1초 간격으로 비프음 출력
		}
		
		Dimension di = tk.getScreenSize();
		int monitorW = di.width;
		int monitorY = di.height;
		
		int x = monitorW/2 -fr.getWidth()/2;
		int y = monitorY/2 -fr.getHeight()/2;
		
		fr.setLocation(x, y);
		fr.setVisible(true);
		
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);

	}
}
