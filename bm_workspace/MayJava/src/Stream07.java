import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


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
		try {
			FileWriter fw=new FileWriter("sample.txt");
			fw.write("HI ���� �ڹٰ� ��Խ��ϴ�.");
			fw.close();
		} catch (IOException e) {
			// ���� ������ �ȵǾ��� �� ����ó��
			e.printStackTrace();
		}
		
		
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
			
		} catch (FileNotFoundException e) {
			// �о�� ������ ���� �� ���� ó��
			e.printStackTrace();
		}
		
		
		
		
		
		

	}//main end

}
