package awtFrame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame03 {
	public static void main(String[] args) {
		/*
		 * ȭ�� �߾ӿ� ������ ��ġ ��Ű��
		 	1. ���� ���� ������� �ػ󵵸� �˾ƾ��Ѵ�.
		 	2. ������� �߾� ��ǥ�� �˾� ���� ��
		 	3. ������ �¿� ũ�⸦ �߾� ��ǥ���� ����� �Ѵ�.
		 		awt.Toolkit <- �̱���
		 		Toolkit beep()
		 			get����ͻ�����() <- !!! width height ��!@
		 		x: ����� �߾� ��ǥ�� - ���� ������� �������� width/2
		 		y: ����� �߾� ��ǥ�� - ���� ������� �������� height/2
		 */
		
		JFrame fr = new JFrame("����°");
		fr.setSize(400, 400);
		
		//Toolkit�� ���� ����� �ػ� ������
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i=0; i<3; i++) {
			try {Thread.sleep(1000); } catch (Exception e) {}
			tk.beep();	//1�� �������� ������ ���
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
