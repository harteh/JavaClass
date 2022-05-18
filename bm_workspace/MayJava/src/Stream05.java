import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class Stream05 {

	public static void main(String[] args) throws Exception {
		// p.531 FileOutputStream
		
		//output2.txt ������ �����Ѵ�.
//		FileOutputStream fos = new FileOutputStream("output2.txt", true);
//		// �ִ� ���Ͽ� �̾ �ۼ��Ҷ� true�� �ִ´�.
//		
//		try(fos){
//			//26�� ũ�� ����Ʈ �迭�� �����.
//			byte[] bs=new byte[26];
//			byte date = 65;
//			
//			//A~Z�� �ƽ�Ű �ڵ尪�� �־� ����� ����Ʈ �迭�� �����.
//			for(int i=0; i<bs.length; i++) {
//				bs[i]=date;
//				date++;
//			}
//			//��ü ����Ʈ �迭�� �Ѳ����� ���(���Ͽ� ����)��
//			fos.write(bs);
//			//fos.write(bs, 2, 10);		//bs�迭�� �ε��� 2���� 10��
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
		
		
		//p.521	- ���� ����
//		ByteArrayInputStream in=null;	//���� �о�ö�
//		FileOutputStream out=null;		
//		
//		try {
//			byte[] b=new byte[] {1,2,3};
//			in=new ByteArrayInputStream(b);		//byte �迭�� �о�ͼ�
//			out=new FileOutputStream("g.dat");	//g.dat ������ ����
//			
//			int r=-1;
//			while((r=in.read()) != -1) {
//				out.write(r);
//			}
//			
//		} catch (Exception e) {}
//		out.close();
//		in.close();
		
		
		// ���� �о����
		/*
		 * ������ ����
		 * ���� �� �����͸� ����Ʈ �迭��Ʈ���� ��� ���� �迭�� ����.
		 * �����Ͱ� ����������,
		 * �����͸� �о�ͼ� ����Ʈ �迭�� �����Ѵ�.
		 * ����Ʈ �迭 ��ŭ for������ �ݺ��ϸ� ȭ�鿡 ����Ѵ�.
		 *  
		 */
		FileInputStream in = null;
		ByteArrayOutputStream out = null;
		
		try {
			//g.dat ������ �о�ͼ�
			in = new FileInputStream("g.dat");
			
			//����Ʈ �迭�� �����ϰڴ�. (�迭 ����)
			out = new ByteArrayOutputStream();
			
			int r=-1;
			while((r=in.read()) != -1) {
				out.write(r);	//�迭�� ������ 1,2,3
			}
			byte[] b=out.toByteArray();
			//.toByteArray() = Creates a newly allocated byte array.
			
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		out.close();
		in.close();
		
		
	}//main End.

}
