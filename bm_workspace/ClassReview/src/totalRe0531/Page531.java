package totalRe0531;

import java.io.FileOutputStream;
import java.io.IOException;

//파일에 바이트 배열로 출력하기
public class Page531 {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("output.txt", true);
		
		try(fos) {
			byte[] bs = new byte[26];
			byte data = 65;
			
			for(int i=0; i< bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);	//배열을 한꺼번에 출력
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력(파일생성) 완료");
	}
}
