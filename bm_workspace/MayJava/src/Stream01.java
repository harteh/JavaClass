import java.io.IOException;

/**
 * 
 * ����Ʈ ��Ʈ��  (����Ʈ ����)
 * 	1) �Է� ��Ʈ�� -> ~~~InputStream
 * 	2) ��� ��Ʈ�� -> ~~~OutputStream
 * 
 * ���� ��Ʈ�� (���� ����)
 * 	1) �Է� ��Ʈ�� -> ~~~Reader
 * 	2) ��� ��Ʈ�� -> ~~~Writer
 * 
 * 
 * 1. ���� ����(���)
 * 	Writer(���ڴ��� ���ϻ���)
 * 	OutputStream(����Ʈ���� ���� ����)
 * 
 *  * ���ΰ� vs ��� *
 * -> Constructors�� �Ű������� ����
 * 	�Ű����� �ȿ� InputStream, OutpuStream, Reader, Writer�� ���̸� ���,
 * 	(-> ������ ���� ���� �ȵ�)
 * 		ex)BufferedOutputStream(OutputStream out)
 * 
 * 	������ ���ΰ�!(-> ������ ���� ���� ����)
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
 *
 */
public class Stream01 {

	public static void main(String[] args) {
		
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
//		int i;
//		try {
//			i = System.in.read();
//			System.out.println(i);
//			System.out.println((char)i);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");
		int i;
		try {
			while( (i = System.in.read()) != '\n' ) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
