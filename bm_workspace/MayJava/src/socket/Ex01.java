package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01 {
	public static void main(String[] args) {

		ServerSocket ser = null;
		
		try {
			ser = new ServerSocket();	//1. �������� ����
			ser.bind(new InetSocketAddress("localhost", 5001));	
			//2. �������ϰ� ���������� ����� ip�ּҿ� ��Ʈ��ȣ
			
			while(true) {
				System.out.println("���� �Ǳ⸦ ��ٸ�");
				Socket so = ser.accept();
				//3. ���� ��û�� �����ϸ鼭 ���� �����Ѵ�.
				
				byte b[] = null;
				String msg=null;
				
				//�о���δ�.
				InputStream in = so.getInputStream();
				b = new byte[100];
				int r = in.read(b);
				//�޽��� ����Ʈ �迭 �д´�.
				
				msg = new String(b,0,r, "UTF-8");
				//����Ʈ�迭�� ���ڿ��� �ٲ۴�.
				System.out.println("������ �ޱ� ����");
				
				OutputStream os = so.getOutputStream();
				msg = "Hi Client";
				b = msg.getBytes("UTF-8");
				//���ڿ��� ����Ʈ�� �����ؼ� �����ϰڴ�.
				os.write(b);
				System.out.println("������ ������ ����");
				
				os.close();
				in.close();
				so.close();
				ser.close();
				
			}
			
		} catch (Exception e) {}
	}
}
