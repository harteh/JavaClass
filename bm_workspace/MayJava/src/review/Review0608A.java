package review;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 1. ������) ��ȭ�� ����մϴ�.��ȭ�� ����մϴ�. ��ȭ�� ����մϴ�.
              	������ ����մϴ�. ������ ����մϴ�. ������ ����մϴ�.
				(th2�� ���� ���ü��� ����, ������ ���)
 *
class MovieThread extends Thread {
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.print("��ȭ�� ����մϴ�.");
		}
	}
}

class MusicThread implements Runnable {
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.print("���Ǹ� ����մϴ�.");
		}
	}
}

public class Review0608A {
	public static void main(String[] args) {

		   Thread th1=new MovieThread();	//up
		   th1.start();	//run() �Լ� ����
		   
		   Thread th2=new Thread(new MusicThread());
		   th2.start();
	}
}
*/

/*
 * 2 ���ڿ� ��1+2+3+4+5���� ��+���� �����ؼ� ���� 15�� ����ض�
	(StringTokenizer,parseInt, trim() �� ���)
 *
public class Review0608A {
	public static void main(String[] args) {
		
		String str = " ���ڿ� ������ �ִ�   ";
		System.out.println(str);
		
		str=str.trim();		//(�յ�)�������� �Լ�
		System.out.println(str);
		System.out.println("*********************");
		
		String str1 = "1+2+3+4+5";
		
		StringTokenizer s = new StringTokenizer(str1, "+");
		
		int sum = 0;
		while(s.hasMoreTokens()) {
			String b = s.nextToken();
			String c = b.trim();
			
			int n = Integer.parseInt(c);
			sum+=n;
		}
		System.out.println(sum);
		
	}
}
*/
/*
 * 3. �̹����� 3�� �ٿ�޾� �����ӿ� �����Ͻÿ�
 */
public class Review0608A extends JFrame{
	
	Review0608A(){

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel("�̹��� 3��");
		
		ImageIcon[] im = {
				new ImageIcon("E://26.newJava/pizza.JPG"),
				new ImageIcon("E://26.newJava/burger.JPG"),	
				new ImageIcon("E://26.newJava/pizza.JPG")
		};

		JLabel[] j1 = new JLabel[3];
		for(int i=0; i<im.length; i++) {
			j1[i] = new JLabel(im[i]);
			c.add(j1[i]);	//�����̳ʿ� ����
		}
		
		
		//setting
		c.add(j);
		
		setSize(600, 550);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Review0608A();
	}
}
