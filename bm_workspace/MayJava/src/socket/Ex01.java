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
			ser = new ServerSocket();	//1. 서버소켓 생성
			ser.bind(new InetSocketAddress("localhost", 5001));	
			//2. 서버소켓과 서버소켓이 연결될 ip주소와 포트번호
			
			while(true) {
				System.out.println("연결 되기를 기다림");
				Socket so = ser.accept();
				//3. 연결 요청을 수락하면서 소켓 생성한다.
				
				byte b[] = null;
				String msg=null;
				
				//읽어들인다.
				InputStream in = so.getInputStream();
				b = new byte[100];
				int r = in.read(b);
				//메시지 바이트 배열 읽는다.
				
				msg = new String(b,0,r, "UTF-8");
				//바이트배열을 문자열로 바꾼다.
				System.out.println("데이터 받기 성공");
				
				OutputStream os = so.getOutputStream();
				msg = "Hi Client";
				b = msg.getBytes("UTF-8");
				//문자열을 바이트로 변경해서 전송하겠다.
				os.write(b);
				System.out.println("데이터 보내기 성공");
				
				os.close();
				in.close();
				so.close();
				ser.close();
				
			}
			
		} catch (Exception e) {}
	}
}
