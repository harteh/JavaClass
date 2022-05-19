package streampart;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader: ���� �б�
 * -- read() : ���� �� ������ �б�
 * -- ������ ũ�Ⱑ ū ���, �� ���ھ� �о���� �ӵ��� �������� ������ 
 * 		�迭�� ��Ƽ� �ϰų�, buffered�� �̿��ص� �ȴ�.
 * -- close() : ��Ʈ�� �ݾ��ֱ�
 * 
 * FileWriter : ���� ���, ���Ͽ� �ؽ�Ʈ ����
 * -- .writer() : ���Ͽ� ������ �����ϱ�
 * -- close() : ��Ʈ�� �ݱ�
 * 
 * FileOutputStream
 * 
 *
 */

public class Stream07 {

	public static void main(String[] args) {
		
		//Ű����κ��� �д� ���� �Է� ��Ʈ�� ����
//		InputStreamReader in=new InputStreamReader(System.in);
//		
//		//�Է��� ���Ͽ� ����
//		FileWriter fw = null;
//		
//		int r;
//		try {
//			fw = new FileWriter("e.txt");
//			
//			while((r=in.read()) != -1) {
//				fw.write(r);
//			}
//			in.close();
//			fw.close();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		/*
		 * sample.txt�� �����
		 * "HI ���� �ڹٰ� ��Խ��ϴ�."
		 * ��� ���ڿ��� ���ٷ� �о� ȭ�鿡 ����ض�
		*/
		
		//���� ���� 1.
//		try {
//			FileWriter fw=new FileWriter("sample.txt");
//			fw.write("HI ���� �ڹٰ� ��Խ��ϴ�.");
//			fw.close();
//		} catch (IOException e) {
//			// ���� ������ �ȵǾ��� �� ����ó��
//			e.printStackTrace();
//		}
		
		
		//���� ���� 2.
		/*
		 * �ֿܼ� �Է��� ���ڿ��� sample.txt ���Ͽ� ����
		 */
		
//		BufferedReader bur=null;	//�����͸� �о���� ���� ��Ʈ��
//		PrintWriter pr=null;		//ȭ�鿡 ����ϱ� ���� ��Ʈ��
//		
//		try {
//			//�ֿܼ� �����͸� �Է¹���
//			bur = new BufferedReader(new InputStreamReader(System.in));
//			
//			//sample.txt ������ �����ϰ�,
//			FileWriter fw = new FileWriter("sample.txt");
//			//����� ������ ��½�Ʈ���� �����Ѵ�.
//			pr = new PrintWriter(fw);
//			
//			//
//			String str=null;
//			while((str=bur.readLine()) != null) {
//				pr.println(str);
//			}
//			bur.close();
//			
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		pr.close();
		
		
		
		
		
		//���� �о���� 1.
		try {
			BufferedReader fr = new BufferedReader(new FileReader("sample.txt"));
			String str;
			
			while(true) {
				try {
					str = fr.readLine();
					
					if(str == null) {
						break;
					}
					System.out.println(str);
					
				} catch (IOException e) {
					// �о�� �����Ͱ� ���� �� ���� ó��
					e.printStackTrace();
				}
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// �о�� ������ ���� �� ���� ó��
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}//main end

}
