package awtFrame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


/*
 * �����尡����ɶ� ȭ�鿡1�ʴ����� ������ ����ϰԲ� ������. 
 * (����0���� �����Ͽ� �����ӿ� ������ ���ڿ��� �����ؼ��ְ�
 * try���ȿ��� 1�ʾ� �����ϰԲ��� ���� ���ܹ߻��ϸ� ������� ����ȴ�.(return)
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
     

        Th t=new Th(j);         //�����尴ü����
        setVisible(true);
        t.start();               //���������
        
        setTitle("Thread");
		setSize(400, 450);       
//		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex12Thread();
	}
}
