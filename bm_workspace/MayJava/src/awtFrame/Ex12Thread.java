package awtFrame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


/*
 * 쓰레드가실행될때 화면에1초단위로 정수를 출력하게끔 만들어라. 
 * (정수0부터 시작하여 프레임에 정수를 문자열로 변경해서넣고
 * try문안에서 1초씩 정지하게끔만 들어라 예외발생하면 쓰레드는 종료된다.(return)
 */
public class Ex12Thread extends JFrame {
	
	class Th extends Thread {
		JLabel j;
		Th (JLabel j){
			this.j = j;
		}
		
		public void run() {
			int n = 0;
			while(true) {
				j.setText(Integer.toString(n));
				n++;
				try {
					sleep(1000);
				} catch (Exception e) {
					return;
				}
			}
		}
	}
	
	Ex12Thread (){
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        JLabel j=new JLabel();

        c.add(j);
     

        Th t=new Th(j);         //쓰레드객체생성
        setVisible(true);
        t.start();               //쓰레드실행
        
        setTitle("Thread");
		setSize(400, 450);       
//		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex12Thread();
	}
}
