package totalRe0531;

import java.io.FileWriter;
import java.io.IOException;

public class Page538 {
	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt")) {
			
			fw.write('A');		//���� �ϳ� ���
			char buf[] = {'B', 'C', 'D', 'E','F','G'};
			
			fw.write(buf);		//���� �迭 ���
			fw.write("�ȳ��ϼ���. �� �����׿�");	//���ڿ� ���
			fw.write(buf, 1, 2);	//���� �迭 �Ϻ� ���
			fw.write("65");		//���� �״�� ���
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}
