package streampart;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter(������Ʈ��)
 * 	: ���ڷ� �� �� �迭�� �����Ͽ� �Ѳ����� �� �� �ִ� ����� ����
 *  
 *  .readLine();
 *   : �� ��� �о�´�.
 *
 */

public class Stream02 {

	public static void main(String[] args) {

		// ������ ������ ����
//		try {
//			FileWriter fw=new FileWriter("b.txt");	//b.txt���� ������
//
//			//p.536
//			BufferedWriter out=new BufferedWriter(fw);	//������Ʈ��
//			out.write("�ȳ�~");
//			out.newLine();	//�ٹٲ�
//			out.write("������ ȭ����~");
//			out.newLine();
//			out.write("stream@naver.com");
//			out.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		//�ֿܼ� ���
		try {
			BufferedReader in=new BufferedReader(new FileReader("b.txt"));
			
			String str;
			
			while(true) {
				try {
					str=in.readLine();
					
					if(str==null) {
						break;	//���ѷ��� ������
					}
					System.out.println(str); //���� �����͸� �о�ͼ� ���
					
				} catch (IOException e) { //���Ͽ� �����Ͱ� ���� �� ����
					e.printStackTrace();
				}
			}
			
			try {	
				in.close();
				
			} catch (IOException e) { //������ ������ �ʾ��� �� ����
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {	//�о�� ������ ���� �� ����
			e.printStackTrace();
		}
		
		
		
	}

}
