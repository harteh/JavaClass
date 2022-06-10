package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		//�ܾ����
		BufferedWriter out = null;
		BufferedReader in = null;
		
		ServerSocket ser = null;	//im, port
		Socket so = null;		//data �ְ���� �� ���
		//�����ʿ��� �ʿ��� ��ü��
		
		Scanner sc = new Scanner(System.in);
		
		try {
			ser = new ServerSocket(9999);
		} catch (Exception e) {}
		System.out.println("���� ��ٸ��� �ִ�");
		//Ŭ���̾�Ʈ�� ���� ��û�� �ö����� ��ٸ���
		
		try {
			so = ser.accept();	//�������
		} catch (Exception e) {}
		
		//�����ʿ��� Ŭ���̾�Ʈ���� �޽��� ������.
		try {
			out = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
			
			//������ �̿��ؼ� �޽����� �о�´�
			in = new BufferedReader(new InputStreamReader(so.getInputStream())); 
			
			while(true) {
				String msg = in.readLine();
				if(msg.equals("stop")) {
					System.out.println("����");
					break;
				}
				System.out.println("������");
				String outmsg = sc.nextLine();
				out.write(outmsg+"\n");
				out.flush();
				//���� ���ۿ� ����Ǿ� �ִ� ������ Ŭ���̾�Ʈ���� �����ϰ�
				//���۸� ����.
			}
			
		} catch (Exception e) {}
		finally {
			try {
				sc.close();
				so.close();
				ser.close();
			} catch (Exception e) {
				System.out.println("���� �߻�");
			}
		}

	}
}
