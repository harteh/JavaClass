package review;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 1. 실행결과) 영화를 재생합니다.영화를 재생합니다. 영화를 재생합니다.
              	음악을 재생합니다. 음악을 재생합니다. 음악을 재생합니다.
				(th2가 먼저 나올수도 있음, 세번씩 출력)
 *
class MovieThread extends Thread {
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.print("영화를 재생합니다.");
		}
	}
}

class MusicThread implements Runnable {
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.print("음악를 재생합니다.");
		}
	}
}

public class Review0608A {
	public static void main(String[] args) {

		   Thread th1=new MovieThread();	//up
		   th1.start();	//run() 함수 실행
		   
		   Thread th2=new Thread(new MusicThread());
		   th2.start();
	}
}
*/

/*
 * 2 문자열 “1+2+3+4+5”를 “+”로 구분해서 총합 15를 출력해라
	(StringTokenizer,parseInt, trim() 다 사용)
 *
public class Review0608A {
	public static void main(String[] args) {
		
		String str = " 문자열 공백이 있다   ";
		System.out.println(str);
		
		str=str.trim();		//(앞뒤)공백제거 함수
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
 * 3. 이미지를 3번 다운받아 프레임에 부착하시오
 */
public class Review0608A extends JFrame{
	
	Review0608A(){

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel("이미지 3개");
		
		ImageIcon[] im = {
				new ImageIcon("E://26.newJava/pizza.JPG"),
				new ImageIcon("E://26.newJava/burger.JPG"),	
				new ImageIcon("E://26.newJava/pizza.JPG")
		};

		JLabel[] j1 = new JLabel[3];
		for(int i=0; i<im.length; i++) {
			j1[i] = new JLabel(im[i]);
			c.add(j1[i]);	//컨네이너에 부착
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
