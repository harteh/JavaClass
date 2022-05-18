import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * ����½�Ʈ�� : �������α׷��� �������ġ�� �����ϴ� ����Ʈ���� ���
 * �Է� -> �Է½�Ʈ�� -> �ڹ��������α׷� -> ��½�Ʈ�� -> ���
 * 
 * ���ڽ�Ʈ��/����Ʈ��Ʈ��
 * 
 * �Է¹޴� ��Ȳ
 * 1. Scanner
 * 2. InputStreamReader(���� ����)
 * 
 * InputStreamReader
 * : ����Ʈ ��Ʈ������ ���� ��Ʈ�������� �ٸ�.
 * : For top efficiency, consider wrapping an InputStreamReader within a BufferedReader.
 * BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 * 
 *
 */
public class Stream04 {

	public static void main(String[] args) {

		//���� ����
//		try {
//			FileWriter fw = new FileWriter("hi.txt");
//			fw.write("�ȳ��ϼ���");
//			fw.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("���α׷�����");
		
		
		//���� �о����
//		try {
//			FileReader fr=new FileReader("hi.txt");
//			int i;
//			while((i=fr.read()) != -1) {
//				System.out.print((char)i);
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//���� �о����
//		try {
//			BufferedReader br=new BufferedReader(new FileReader("hi.txt"));
//			try {
//				String str;
//				while(true) {
//					str = br.readLine();
//					if( str==null) {
//						break;
//					}
//					System.out.println(str);
//				}
//				
//			} catch (IOException e) { // �о�� �����Ͱ� ���� �� ����ó��
//				e.printStackTrace();
//			}
//			
//		} catch(FileNotFoundException e) {	//����� ������ ���� �� ����ó��
//			e.printStackTrace();
//		}
		
		
		//�ֿܼ� �Է��� ���� ������ �����ϱ�
		BufferedReader bu=null;		//�Է��ϱ� ���� ������ �Է� ��Ʈ��
		PrintWriter pr=null;		//����ϱ� ���� ������ ��� ��Ʈ��
		
		try {
			
			//�ֿܼ� �Է��ϱ� ���� Scanner ��� ���
			InputStreamReader in=new InputStreamReader(System.in);
			
			//�Է¹��� ���� ������ �Է� ��Ʈ���� �����Ѵ�.
			bu=new BufferedReader(in);
			
			//BufferedReader bu=new BufferedReader(new InputStreamReader(System.in)); 
			//���� ����
			
			FileWriter fw=new FileWriter("d.txt");
			
			//d.txt�� ����
			pr = new PrintWriter(fw);
			
			String str=null;
			while((str=bu.readLine()) != null) {
				//���Ͽ� ����
				pr.println(str);
			}
			bu.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pr.close();
		}
		
		
		
		
		

	}

}
