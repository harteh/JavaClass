package awtFrame;

import javax.swing.JFrame;

public class Frame02 {
	public static void main(String[] args) {
		
		JFrame fr = new JFrame("�ι�°");
		fr.setSize(400, 400);		//������
		fr.setLocation(800, 100);	//��ǥ
		
		//x��ư���� ������ �ݱ�
		//�������� ���� �� �ƿ� �޸𸮿��� ��������
		//�� ����� JFrame������ ��� �����ϸ� �Ϲ� Frame������ ���Ұ�
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		
		//�������� ������ �� ���ϴ� �ϳ��� �����Ӹ� �����ϰ��� �Ѵٸ� dispose()
		//�����ִ� �������� ���� ������� ������ VM�� �����Ϸ��� System.exit(0)
		//fr.dispose();
		
	}
}
