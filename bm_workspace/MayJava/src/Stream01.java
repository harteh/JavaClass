import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ����Ʈ ��Ʈ��  (����Ʈ ����)
 * 	1) �Է� ��Ʈ�� -> ~~~InputStream
 * 	2) ��� ��Ʈ�� -> ~~~OutputStream
 * 
 * ���� ��Ʈ�� (���� ����)
 * 	1) �Է� ��Ʈ�� -> ~~~Reader
 * 	2) ��� ��Ʈ�� -> ~~~Writer
 */

 /** 
 * 1. ���� ����(���)
 * 	Writer(���ڴ��� ���ϻ���)
 * 	OutputStream(����Ʈ���� ���� ����)
 * 
 *  * ���ΰ� vs ��� *
 * -> Constructors�� �Ű������� ����
 * 	�Ű����� �ȿ� InputStream, OutpuStream, Reader, Writer�� ���̸� ���(������Ʈ��),
 * 	(-> ������ ���� ���� �ȵ�)
 * 		ex)BufferedOutputStream(OutputStream out)
 * 
 * 	������ ���ΰ�!(-> ������ ���� ���� ����)(��ݽ�Ʈ��)
 * 		ex)FileOutputStream(File file)
 * 
 * 2. ���Ͽ��� �� ����
 * 	write �޼ҵ�
 * 
 * 3. ���� �о����
 * 	Reader(���ڴ����� �о����)
 * 	InputStream(����Ʈ������ �о����)
 * 
 * 4. ���� �ݱ�
 * 	close()
 */

/**
 * Writer �޼ҵ�
 * -> ���� ������ ����ϴ� ��Ʈ�� �� �ֻ��� ��Ʈ��
 * 
 *
 */
public class Stream01 {

	public static void main(String[] args) {
		
		//System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
//		int i;
//		try {
//			i = System.in.read();
//			System.out.println(i);
//			System.out.println((char)i);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		//System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");
//		int i;
//		try {
//			while( (i = System.in.read()) != '\n' ) {
//				System.out.print((char)i);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		//a.txt ���� ����
//		char a='S';		//S �� �ƽ�Ű�ڵ�� ��ȯ�Ǿ� int ������ ����ȴ�.
//		char b='W';
//		
//		try {
//			FileWriter out = new FileWriter("a.txt");
//			//�ܵ����� ���� ���� �����ϴ� -> FileWriter�� ��� ��Ʈ���̱� ������.
//			out.write(a);
//			out.write(b);
//			out.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		
		
		//����� SW�� �о���� �ʹ�.
		char arr[]=new char[10];
		int r;
		
		try {
			FileReader in = new FileReader("a.txt");
			//���Ͽ� ������ ���ڸ� �о�鿩��
			try {
				r = in.read(arr, 0, arr.length);
				//�迭�� 0���� ���̸�ŭ �о�ͼ� r �� �����Ѵ�.
				
				for(int i=0; i<r; i++) {
					System.out.println(arr[i]);
				}
				
			} catch (IOException e) {
				// �о�� �����Ͱ� ���� ��
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// ������ ���� �� ����ó��
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
