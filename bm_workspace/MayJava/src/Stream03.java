import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Stream03 {

	public static void main(String[] args) {
		// p.538
		
		//���� ����
//		try {
//			FileWriter fw=new FileWriter("writer.txt"); //����'writer.txt' ����
//			
//			fw.write('A'); //���� �ϳ� ���
//			char buf[]= {'B','C','D','E','F','G'};
//			
//			fw.write(buf); //���� �迭 ���
//			fw.write("�ȳ��ϼ���. �����׽�Ʈ�Դϴ�."); //���ڿ� ���
//			fw.write(buf, 3, 2);	//EFG //���� �迭�� �Ϻ� ���
//			//���ڹ迭��, �����ε���, ��°���
//			
//			fw.write("97"); //���ڸ� �״�� ���
//			fw.close();
//			
//		} catch (IOException e) {
//			// ������ ������ ���� ���� ó��
//			e.printStackTrace();
//		}
		
		
		/*
		 * ������ �о�´� -> ������ �������� ����ó��
		 * 	���ڴ����� �Ѳ���(�迭���)�� ���� �� �ִ� BufferedReader ��� 
		 * *
		 * ���� ���� �ȿ��� 
		 * �ٴ����� �����͸� �о�ͼ� �����Ѵ�. ->�����Ͱ� ���� ���� ���� ó��
		 * ������ �����͸� ����Ѵ�.
		 */
		
//		try {
//			BufferedReader in=new BufferedReader(new FileReader("writer.txt"));
//			
//			String str;
//			
//			while(true) {
//				try {
//					str=in.readLine();
//					if(str == null) {
//						break;
//					}
//					System.out.println(str);
//					
//				} catch (IOException e) {
//					// �о�� �����Ͱ� �������� ���� ó��
//					e.printStackTrace();
//				}
//			}
//			
//		} catch (FileNotFoundException e) {
//			// ������ ���� ���� ���� ó��
//			e.printStackTrace();
//		}//BufferedReader ���
		
		
		try {
			FileReader fr=new FileReader("writer.txt");
			int i;
			while((i=fr.read())!= -1) {
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}//FileReader ���
		

	}

}
