package totalQuestion0606;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 6.	Scanner�� �Է� ���� �̸�(���ڿ�), id(���ڿ�)�� �� �ٸ��� ����(test02.txt)�� �����ض�.
	���׸��� �Է��ϸ� ������Ѷ�. 
	���׸��� �Է��ϱ� �������� ���ڿ��� ���Ͽ� �����ض�.(break, FileWriter ���)
		���� ���) ȫ�浿 hong
		�̱浿 lee
		�׸�	
 */
public class Q06 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("test02.txt");
		
		while(true) {
			String name = sc.next();
			if(name.equals("�׸�")) {
				break;
			}
			else {
				String uid = sc.next();
				fw.write(name +" " + uid+"\r\n");
			}
		}
		fw.close();
		sc.close();
	}
}
