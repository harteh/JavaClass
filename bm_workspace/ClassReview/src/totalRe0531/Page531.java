package totalRe0531;

import java.io.FileOutputStream;
import java.io.IOException;

//���Ͽ� ����Ʈ �迭�� ����ϱ�
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
			fos.write(bs);	//�迭�� �Ѳ����� ���
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���(���ϻ���) �Ϸ�");
	}
}
