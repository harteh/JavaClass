package review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Review0519D {

	public static void main(String[] args) throws IOException {
		/*
		 * Sample1.txt ���Ͽ�
		 * "���� �ڹٸ� �����մϴ�"�� �����ϰ�
		 * ������ �о� ȭ�鿡 ����ض�
		 * (String[] �迭�� �ʱ�ȭ�ؼ� for������ �б�) 
		 */
		
		String[] arrS = {"���� �ڹٸ� �����մϴ�. ���� ��"};
		
		//���� ����
		BufferedWriter bfw = new BufferedWriter(new FileWriter("Sample1.txt"));
		
		for (int i = 0; i < arrS.length; i++) {
			bfw.write(arrS[i]);
		}
		bfw.close();
		
		//���� �ҷ�����
		BufferedReader br = new BufferedReader(new FileReader("Sample1.txt"));
		
		String str;
		
		for(;;) {
			str=br.readLine();
			if(str==null) { break; }
			System.out.println(str);
		}
		br.close();
		
		
		

	}

}
